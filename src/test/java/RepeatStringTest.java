import static org.junit.jupiter.api.Assertions.*;

class RepeatStringTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void test_abac_8() {
        String s = "abac";
        long n = 8;
        assertEquals(4, RepeatString.repeatString(s, n));
    }


    @org.junit.jupiter.api.Test
    void test_aba_10() {
        String s = "aba";
        long n = 10;
        assertEquals(7, RepeatString.repeatString(s, n));
    }
    @org.junit.jupiter.api.Test
    void test_aab_882787() {
        String s = "aab";
        long n = 882787;
        assertEquals(588525, RepeatString.repeatString(s, n));
    }
    @org.junit.jupiter.api.Test
    void test_gfcaaaecbg_547602() {
        String s = "gfcaaaecbg";
        long n = 547602;
        assertEquals(164280, RepeatString.repeatString(s, n));
    }



    @org.junit.jupiter.api.Test
    void test_a_1000000000000() {
        String s = "a";
        long n = 1000000000000L;
        assertEquals(1000000000000L, RepeatString.repeatString(s, n));
    }

    @org.junit.jupiter.api.Test
    void test_kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm_736778906400() {
        String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
        long n = 736778906400L;
        assertEquals(51574523448L, RepeatString.repeatString(s, n));
    }
}