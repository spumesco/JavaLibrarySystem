import java.io.*;
import java.util.*;

public class CsvManager {

    // 파일 이름 설정
    private static final String FILE_NAME = "Book data.csv";

    public static void main(String[] args) {
        // 1. 데이터 준비
        TreeMap<Integer, ArrayList<String>> library = new TreeMap<>();
        library.put(1001, new ArrayList<>(Arrays.asList("978-11-1111-1111","정의란 무엇인가,마이클 샌델","16200","인문","와이즈 베리")));
        library.put(1002, new ArrayList<>(Arrays.asList("978-11-1111-1112", "자바의 정석", "남궁성", "28000")));
        library.put(1003, new ArrayList<>(Arrays.asList("978-11-1111-1113,Harry Potter", "J.K. Rowling","15000")));

        // 2. CSV 파일로 저장
        saveToCsv(library);

        // 3. 테스트를 위해 메모리 비우기
        library.clear();
        System.out.println("--- 메모리 삭제됨 (데이터 개수: " + library.size() + ") ---");

        // 4. CSV 파일에서 다시 로드
        loadFromCsv(library);

        // 5. 결과 확인
        System.out.println("\n--- 파일에서 불러온 데이터 확인 ---");
        for (Integer code : library.keySet()) {
            System.out.println(library.get(code));
        }
    }

    // === [저장하는 메서드] ===
    public static void saveToCsv(TreeMap<Integer, ArrayList<String>> map) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {

            bw.write("ID,Title,Author,Price,publisher");
            bw.newLine();

            for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
                Integer key = entry.getKey();
                ArrayList<String> values = entry.getValue();

                // 데이터 조합: Key + "," + 값1 + "," + 값2 ...
                // String.join(",", values)는 리스트 안의 문자열을 콤마로 연결해줍니다.
                String line = key + "," + String.join(",", values);

                bw.write(line);
                bw.newLine(); // 다음 줄로 이동
            }
            System.out.println("파일 저장 완료: " + FILE_NAME);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // === [불러오는 메서드] ===
    public static void loadFromCsv(TreeMap<Integer, ArrayList<String>> map) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            boolean isHeader = true; // 헤더인지 확인하는 플래그

            while ((line = br.readLine()) != null) {
                // 첫 줄(헤더)은 건너뜀
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                // 콤마(,)를 기준으로 문자열 자르기
                String[] data = line.split(",");

                // CSV가 깨졌거나 빈 줄일 경우 대비
                if (data.length < 5) continue;

                // 1. Key 파싱 (String -> Integer)
                int key = Integer.parseInt(data[0]);

                // 2. Value 리스트 생성
                ArrayList<String> infoList = new ArrayList<>();
                infoList.add(data[1]); // Title
                infoList.add(data[2]); // Author
                infoList.add(data[3]); // Year
                infoList.add(data[4]); // Price

                // 3. Map에 저장
                map.put(key, infoList);
            }
            System.out.println("파일 로드 완료!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}