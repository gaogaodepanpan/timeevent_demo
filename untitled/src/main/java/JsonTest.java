import java.util.List;

public class JsonTest {
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Misson> getMissions() {
        return missions;
    }

    public void setMissions(List<Misson> missions) {
        this.missions = missions;
    }

    private String result;

    private Data data;

    private List<Misson> missions;

    @Override
    public String toString() {
        return "JsonTest{" +
                "result='" + result + '\'' +
                ", data=" + data +
                ", missions=" + missions +
                '}';
    }
}
