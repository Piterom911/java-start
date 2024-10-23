package homeworks.homework_21;

import java.util.HashMap;
import java.util.Map;

public class Solution_02 {
    public static void main(String[] args) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("model", "V-60");
        parameters.put("country", "Germany");
        parameters.put("city", "Berlin");
        parameters.put("year", null);
        parameters.put("active", true);

        String sqlQuery = buildSQLQuery(parameters);
        System.out.println(sqlQuery);
    }

    public static String buildSQLQuery(Map<String, Object> params) {
        StringBuilder query = new StringBuilder("SELECT * FROM cars WHERE ");

        boolean isFirstCondition = true;

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (value != null) {
                if (!isFirstCondition) {
                    query.append(" AND ");
                }

                if (value instanceof String) {
                    query.append(key).append(" = '").append(value).append("'");
                } else {
                    query.append(key).append(" = ").append(value);
                }

                isFirstCondition = false;
            }
        }

        if (isFirstCondition) {
            return "SELECT * FROM cars";
        }

        return query.toString();
    }
}


// Сформировать SQL запрос:  Вернуть все записи из cars, где параметры равны заданным, используя StringBuilder.
// Если значение null, то параметр не должен попадать в запрос.
// {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
// Пример: {"id", 1, "country", null, "city", "Helsinki", "year", null}
// Результат: SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';