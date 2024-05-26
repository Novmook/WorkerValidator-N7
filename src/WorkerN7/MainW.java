package WorkerN7;

public class MainW {
    public static void main(String[] args) {
        // Объявление и инициализация массива Worker с пятью объектами Worker
        Worker[] worker = {
                new Worker("Лара ", "55"),
                new Worker("Митяй ", "14"),
                new Worker("Ваня ", "26"),
                new Worker("Паучиха ", "48"),
                new Worker("Маруся ", "12")
        };

        // Создание массива целых чисел для хранения возрастов работников
        int[] a = new int[worker.length];

        // Цикл по массиву worker
        for (int i = 0; i < worker.length; i++) {
            try {
                // Преобразование возраста работника из строки в целое число
                a[i] = Integer.parseInt(worker[i].getAge());
                // Вывод информации о работнике
                worker[i].info();
            } catch (StringException e) {
                // Обработка пользовательского исключения StringException
                e.printStackTrace();
            }
        }
    }
}
