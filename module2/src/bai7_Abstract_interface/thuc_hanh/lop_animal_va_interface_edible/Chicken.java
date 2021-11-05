package bai7_Abstract_interface.thuc_hanh.lop_animal_va_interface_edible;

public class Chicken extends Animals implements Edible {
    @Override
    public String makeSound() {
        return "O O O O";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
