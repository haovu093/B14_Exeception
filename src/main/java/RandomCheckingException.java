public class RandomCheckingException extends  Exception{
    public RandomCheckingException (String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vào số tự nhiên: " + super.getMessage();
    }
}


