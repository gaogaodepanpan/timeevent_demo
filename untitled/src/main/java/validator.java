public class validator implements validate{
    @Override
    public void find(int a, int b) {
        if (a<b){
            throw new TestException("异常抛出");
        }
    }
}
