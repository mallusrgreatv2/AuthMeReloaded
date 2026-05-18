package fr.xephi.authme.security.crypts;

/**
 * Test for {@link Argon2}.
 */
public class Argon2Test extends AbstractEncryptionMethodTest {

    public Argon2Test() {
        super(new Argon2(),
            "$argon2id$v=19$m=65536,t=2,p=1$aU9vQ3plOXdhSlVkZEU1ZA$r2j6OwgzHc6HLMt0EKJXFWmRvXysc5NH8IFBNCpTYV0",  // password
            "$argon2id$v=19$m=65536,t=2,p=1$YnRGMzlDTmJPUFo1dms2eQ$wcLyfRbKiBuGzLIjFjZmmIWXHPnbuegP1u1eBK8Zsq8",  // PassWord1
            "$argon2id$v=19$m=65536,t=2,p=1$OUs0R0d6bVZDYmVIbkNLZA$SuCYC6fqsKXAdBwioapER1vq0GcCMKIB1Xnhe9AmE+4",  // &^%te$t?Pw@_
            "$argon2id$v=19$m=65536,t=2,p=1$NG9nM0FJbnJId1dGV0Q1Zw$9oGrNxgvD5XSDy0GKb55/RDJAxdGjuE7ETtzcTMj0Aw"); // âË_3(íù*
    }

    @Override
    protected boolean testHashEqualityForSameSalt() {
        // Argon2 has a salt but it is handled internally
        return false;
    }
}
