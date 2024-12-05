public class CastingEmArrays {
    public static void main(String[] args) {
        Object[] array = new Object[5];
        array[0] = 10;
        array[1] = 15.5;
        array[2] = "Olá, Mundo!";
        array[3] = 42;
        array[4] = 3.14;

        for (Object obj : array) {
            if (obj instanceof Integer) {
                Integer valorInt = (Integer) obj;
                System.out.println("Valor convertido para Integer: " + valorInt);
            } else if (obj instanceof Double) {
                Double valorDouble = (Double) obj;
                System.out.println("Valor convertido para Double: " + valorDouble);
            } else if (obj instanceof String) {
                String valorString = (String) obj;
                System.out.println("Valor convertido para String: " + valorString);
            } else {
                System.out.println("Tipo desconhecido: " + obj);
            }
        }
    }
}