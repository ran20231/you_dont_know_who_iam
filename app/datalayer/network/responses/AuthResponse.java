package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.database.UserEntity;
import com.leanplum.internal.Constants;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AuthResponse.kt */
/* loaded from: classes2.dex */
public final class AuthResponse {
    public static final int $stable = 8;
    @c("data")
    private final Data data;
    @c(Constants.Params.MESSAGE)
    private final String message;

    /* compiled from: AuthResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Data {
        public static final int $stable = 8;
        @c("token")
        private final Token token;
        @c("user")
        private final UserEntity user;

        public Data(Token token, UserEntity user) {
            o.i(token, "token");
            o.i(user, "user");
            this.token = token;
            this.user = user;
        }

        public static /* synthetic */ Data copy$default(Data data, Token token, UserEntity userEntity, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                token = data.token;
            }
            if ((i11 & 2) != 0) {
                userEntity = data.user;
            }
            return data.copy(token, userEntity);
        }

        public final Token component1() {
            return this.token;
        }

        public final UserEntity component2() {
            return this.user;
        }

        public final Data copy(Token token, UserEntity user) {
            o.i(token, "token");
            o.i(user, "user");
            return new Data(token, user);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            if (o.d(this.token, data.token) && o.d(this.user, data.user)) {
                return true;
            }
            return false;
        }

        public final Token getToken() {
            return this.token;
        }

        public final UserEntity getUser() {
            return this.user;
        }

        public int hashCode() {
            return (this.token.hashCode() * 31) + this.user.hashCode();
        }

        public String toString() {
            Token token = this.token;
            UserEntity userEntity = this.user;
            return "Data(token=" + token + ", user=" + userEntity + ")";
        }
    }

    /* compiled from: AuthResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Token {
        public static final int $stable = 8;
        @c("access_token")
        private final String accessToken;
        @c("expires_at")
        private final Object expiresAt;
        @c("type")
        private final String type;

        public Token(String accessToken, Object expiresAt, String type) {
            o.i(accessToken, "accessToken");
            o.i(expiresAt, "expiresAt");
            o.i(type, "type");
            this.accessToken = accessToken;
            this.expiresAt = expiresAt;
            this.type = type;
        }

        public static /* synthetic */ Token copy$default(Token token, String str, Object obj, String str2, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                str = token.accessToken;
            }
            if ((i11 & 2) != 0) {
                obj = token.expiresAt;
            }
            if ((i11 & 4) != 0) {
                str2 = token.type;
            }
            return token.copy(str, obj, str2);
        }

        public final String component1() {
            return this.accessToken;
        }

        public final Object component2() {
            return this.expiresAt;
        }

        public final String component3() {
            return this.type;
        }

        public final Token copy(String accessToken, Object expiresAt, String type) {
            o.i(accessToken, "accessToken");
            o.i(expiresAt, "expiresAt");
            o.i(type, "type");
            return new Token(accessToken, expiresAt, type);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (o.d(this.accessToken, token.accessToken) && o.d(this.expiresAt, token.expiresAt) && o.d(this.type, token.type)) {
                return true;
            }
            return false;
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final Object getExpiresAt() {
            return this.expiresAt;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.accessToken.hashCode() * 31) + this.expiresAt.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            String str = this.accessToken;
            Object obj = this.expiresAt;
            String str2 = this.type;
            return "Token(accessToken=" + str + ", expiresAt=" + obj + ", type=" + str2 + ")";
        }
    }

    public AuthResponse(Data data, String str) {
        o.i(data, "data");
        this.data = data;
        this.message = str;
    }

    public static /* synthetic */ AuthResponse copy$default(AuthResponse authResponse, Data data, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            data = authResponse.data;
        }
        if ((i11 & 2) != 0) {
            str = authResponse.message;
        }
        return authResponse.copy(data, str);
    }

    public final Data component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final AuthResponse copy(Data data, String str) {
        o.i(data, "data");
        return new AuthResponse(data, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthResponse)) {
            return false;
        }
        AuthResponse authResponse = (AuthResponse) obj;
        if (o.d(this.data, authResponse.data) && o.d(this.message, authResponse.message)) {
            return true;
        }
        return false;
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.data.hashCode() * 31;
        String str = this.message;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        Data data = this.data;
        String str = this.message;
        return "AuthResponse(data=" + data + ", message=" + str + ")";
    }
}
