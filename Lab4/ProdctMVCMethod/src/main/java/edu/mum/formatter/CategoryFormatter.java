package edu.mum.formatter;

import edu.mum.domain.Category;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CategoryFormatter implements Formatter<Category> {
    @Override
    public Category parse(String s, Locale locale) throws ParseException {
        int id = Integer.parseInt(s.substring(0, 1));
        String name = s.substring(2);
        return new Category(id, name);
    }

    @Override
    public String print(Category category, Locale locale) {
        return category.getId() + ":" + category.getName();
    }
}
