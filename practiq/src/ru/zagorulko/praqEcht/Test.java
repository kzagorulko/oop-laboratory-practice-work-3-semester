package ru.zagorulko.praqEcht;

public class Test {

    public static void main(String[] args) {
        // Тестируем Заказ, непосредственно составленного в магазине
        TableOrdersManager orderManager = new TableOrdersManager();

        Order to = new TableOrder();
        to.add(new Drink("Пиво Балтика",
                "Нежное и душистое разливное пиво, свареное в лучших традициях балтийского моря", 200,
                DrinkTypeEnum.BEER));
        to.add(new Dish("Сосика по баварски","Ароматная и аппетитная сосика со сладкой баварской горчицей",
                340));

        Order to1 = new TableOrder();
        to1.add(new Drink("Вино Апсны", "Каберне савиньйон абхазского производства.  " +
                "Вино Апсны имеет сладковато-терпкий насыщенный вкус с легкой кислинкой.", 1004,
                DrinkTypeEnum.WINE));
        to1.add(new Dish("Шоколадный рожок","Обвоорожительно сладкий, но не притарный шоколодный рожок " +
                          "Лучшее дополнение жаркого летнего вечера",10));

        orderManager.add(to, 1);
        orderManager.add(to1, 2);

        System.out.println("Стоимость первого заказа: " + to.costTotal());

        System.out.println("Количество позиций в первом заказе: " + ((TableOrder) to).getSize());

        System.out.println("Сумма всех заказов: " + orderManager.ordersCostSummary());

        InternetOrdersManager internetOrderManager = new InternetOrdersManager();

        Order Ito = new InternetOrder();
        Ito.add(new Drink("Кока-кола лайт", "Есть шанс не заработать диабет", 50));
        Ito.add(new Dish("Борщ домашний","Борщ, как у вашей бабушки, такой же родной и вызывющий " +
                "настальгию.",140));

        Order Ito1 = new InternetOrder();
        Ito1.add(new Drink("Спрайт", "Не пейте много, иначе прейдёте только на воду", 100));
        Ito1.add(new Drink("Вода Бон Аква", "Лёгкогазированная приятная на вкус и запах вода", 70));
        Ito1.add(new Dish("Чивапчичи","Стоило бы подумать перед тем, как эо есть",100));

        internetOrderManager.add(Ito);
        internetOrderManager.add(Ito1);

        // выводим полную цену заказа
        System.out.println("Стоимость первого интеренет заказа: " + Ito.costTotal());
        System.out.println("Стоимость второго интернет заказа: " + Ito1.costTotal());

        // получаем количество элементов в заказе
        System.out.println(((InternetOrder) Ito).getSize());
    }
}
