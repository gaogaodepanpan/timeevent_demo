import java.io.*;

import com.alibaba.fastjson.JSONObject;
public class Convert {
    public static void main(String[] args) throws Exception {
        String json = readJsonFile("src/main/java/provider.json");
        JsonTest jsonTest = parseJson(json);
        System.out.println(jsonTest.toString());

    }

    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JsonTest parseJson(String json) {

        JsonTest jsonTest = JSONObject.parseObject(json,JsonTest.class);
        return jsonTest;
    }

}
