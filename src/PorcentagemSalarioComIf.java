public class PorcentagemSalarioComIf {
    public static void main(String[] args) {
        float salario = 4700.50F;
        if (salario >= 4500) {
            float trintaPorCento = salario * 0.3F;
            System.out.println("30% do salario e: " + trintaPorCento);
        } else {
            float quinzePorCento = salario * 0.15F;
            System.out.println("15% do salario e: " + quinzePorCento);
        }
    }
}
