package snake.app.first.com.brothersnake.gameplay.controllers;

import snake.app.first.com.brothersnake.gameplay.Field;
import snake.app.first.com.brothersnake.gameplay.objects.FieldObject;

/**
 * Контроллер для недвигающихся обьектов
 */
public class WithoutActionControllerObject implements ObjectController {

    private final Field mField;
    private final FieldObject mFieldObject;

    public WithoutActionControllerObject(Field field, FieldObject fieldObject){
        mField = field;
        mFieldObject = fieldObject;

        changeLocation(0, 0);
    }

    /**
     * Пустая реализация метода - обьект не будет двигаться (фрукты, стены)
     */
    @Override
    public void next() {

    }

    @Override
    public FieldObject getObject() {
        return mFieldObject;
    }

    /**
     * Задаем местоположение
     */
    private void changeLocation(int x, int y) {
        mField.addObject(mFieldObject, x, y);
        mFieldObject.setX(x);
        mFieldObject.setY(y);
    }
}
