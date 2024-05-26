package WorkerN7;

// Класс Worker
class Worker {
    public String name;
    public String age;

    // Конструктор класса Worker, инициализирующий имя и возраст
    public Worker(String name, String age) {
        this.name = name;
        this.age = age;
    }

    // Метод для получения возраста работника с проверкой
    public String getAge() throws StringException {
        // Проверка, что возраст состоит только из цифр
        for (int i = 0; i < age.length(); i++) {
            if (age.charAt(i) < '0' || age.charAt(i) > '9') {
                // Если возраст содержит нецифровой символ, выбросить исключение
                throw new StringException("Возраст указывается в цифрах!");
            }
        }
        // Возврат возраста, если проверка пройдена
        return age;
    }

    // Метод для установки возраста работника
    public void setAge(String age) {
        this.age = age;
    }

    // Метод для вывода информации о работнике
    public void info() {
        System.out.println("Имя: " + name + " ; " + " Возраст " + age);
    }

    // Метод для получения имени работника
    public String getName() {
        return name;
    }

    // Метод для установки имени работника
    public void setName(String name) {
        this.name = name;
    }
}
