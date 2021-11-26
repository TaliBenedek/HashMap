import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class OurHashMapTest
{

    @Test
    void size()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");

        //when
        int size = map.size();

        //then
        assertEquals(3, size);
    }

    @Test
    void isEmptyTrue()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();

        //when
        boolean empty = map.isEmpty();

        //then
        assertTrue(empty);
    }

    @Test
    void isEmptyFalse()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");

        //when
        boolean empty = map.isEmpty();

        //then
        assertFalse(empty);
    }

    @Test
    void containsKeyTrue()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");

        //when
        boolean contains = map.containsKey("SPANISH");

        //then
        assertTrue(contains);
    }

    @Test
    void containsKeyFalse()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");

        //when
        boolean contains = map.containsKey("RUSSIAN");

        //then
        assertFalse(contains);
    }

    @Test
    void containsValueTrue()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");

        //when
        boolean contains = map.containsValue("HOLA");

        //then
        assertTrue(contains);
    }

    @Test
    void containsValueFalse()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");

        //when
        boolean contains = map.containsValue("HEY");

        //then
        assertFalse(contains);
    }

    @Test
    void removeTrue()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");

        //when
        String remove = map.remove("SPANISH");

        //then
        assertEquals("HOLA", remove);
        assertFalse(map.containsKey("SPANISH"));
    }

    @Test
    void removeFalse()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");

        //when
        String remove = map.remove("RUSSIAN");

        //then
        assertNull(remove);
    }

    @Test
    void putAll()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("SPANISH", "HOLA");
        map2.put("HEBREW", "SHALOM");

        //when
        map.putAll(map2);

        //then
        assertTrue(map.containsKey("SPANISH"));
        assertTrue(map.containsKey("HEBREW"));
        assertTrue(map.containsValue("HOLA"));
        assertTrue(map.containsValue("SHALOM"));
    }

    @Test
    void clear()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");

        //when
        map.clear();

        //then
        assertTrue(map.isEmpty());
    }

    @Test
    void keySet()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");

        Set<String> expectedSet = new HashSet<>();
        expectedSet.add("ENGLISH");
        expectedSet.add("SPANISH");
        expectedSet.add("HEBREW");

        //when
        Set<String> keySet = map.keySet();

        //then
        assertEquals(expectedSet, keySet);
    }

    @Test
    void values()
    {
        //given
        OurHashMap<String, String> map = new OurHashMap<>();
        map.put("ENGLISH", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");

        List<String> expectedCollection = new ArrayList<>();
        expectedCollection.add("HELLO");
        expectedCollection.add("HOLA");
        expectedCollection.add("SHALOM");

        //when
        Collection<String> values = map.values();

        //then
        assertEquals(expectedCollection, values);
    }

    @Test
    void getNull()
    {
        // given
        OurHashMap<String, String> map = new OurHashMap<>();

        // when

        // then
        assertNull(map.get("ENGLISH1"));
    }

    @Test
    void put()
    {
        // given
        OurHashMap<String, String> map = new OurHashMap<>();

        // when
        map.put("ENGLISH1", "HELLO");
        map.put("ENGLISH2", "HI");
        map.put("ENGLISH3", "HEY");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");
        map.put("FRENCH", "BONJOUR");
        map.put("RUSSIAN", "PRIVIT");
        map.put("JAPANESE", "NE HOW");
        map.put("MANDARIN", "CONICHIWA");

        // then
        assertEquals("HELLO", map.get("ENGLISH1"));
        assertEquals("HI", map.get("ENGLISH2"));
        assertEquals("HEY", map.get("ENGLISH3"));
        assertEquals("HOLA", map.get("SPANISH"));
        assertEquals("SHALOM", map.get("HEBREW"));
        assertEquals("BONJOUR", map.get("FRENCH"));
        assertEquals("PRIVIT", map.get("RUSSIAN"));
        assertEquals("NE HOW", map.get("JAPANESE"));
        assertEquals("CONICHIWA", map.get("MANDARIN"));
    }

    @Test
    void putSameKeys()
    {
        // given
        OurHashMap<String, String> map = new OurHashMap<>();

        // when
        map.put("ENGLISH1", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");
        map.put("FRENCH", "BONJOUR");
        map.put("ENGLISH1", "HI");

        // then
        assertEquals("HI", map.get("ENGLISH1"));
    }
}