package psa.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();
    }

    @Test
    public void getId() throws Exception {

        Long testId = 4L;
        category.setId(testId);
        assertEquals(testId,category.getId());

    }

    @Test
    public void getDescription() throws Exception {

    }

    @Test
    public void getRecipes() throws Exception {

    }
}