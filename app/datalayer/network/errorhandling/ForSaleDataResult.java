package com.forsale.app.datalayer.network.errorhandling;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ForSaleDataResult.kt */
/* loaded from: classes2.dex */
public interface ForSaleDataResult<T> {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ForSaleDataResult.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Error blockedUserError(String str) {
            return new Error.ApiError.UserError.UserIsBlockedError(str);
        }

        public final ForSaleDataResult emptyResponseError() {
            return Error.EmptyResponseError.INSTANCE;
        }

        public final Error.GeneralError generalError(String str) {
            return new Error.GeneralError(str);
        }

        public final Error internetError() {
            return Error.InternetConnectionError.INSTANCE;
        }

        public final <T> ForSaleDataResult<T> success(T t11) {
            return new Success(t11);
        }

        public final Error unAuthorizedUserError(String str) {
            return new Error.ApiError.UserError.UnAuthorizedUserError(str);
        }

        public final Error unExpectedError(Throwable exception) {
            o.i(exception, "exception");
            return new Error.ServerError.UnexpectedError(exception);
        }

        public final Error validationError(NetworkErrorModel networkErrorModel) {
            return new Error.ApiError.ValidationError(networkErrorModel);
        }
    }

    /* compiled from: ForSaleDataResult.kt */
    /* loaded from: classes2.dex */
    public static abstract class Error implements ForSaleDataResult {
        public static final int $stable = 0;
        private final String errorMsg;

        /* compiled from: ForSaleDataResult.kt */
        /* loaded from: classes2.dex */
        public static abstract class ApiError extends Error {
            public static final int $stable = 0;
            private final String message;

            /* compiled from: ForSaleDataResult.kt */
            /* loaded from: classes2.dex */
            public static abstract class UserError extends ApiError {
                public static final int $stable = 0;
                private final String errorMessage;

                /* compiled from: ForSaleDataResult.kt */
                /* loaded from: classes2.dex */
                public static final class UnAuthorizedUserError extends UserError {
                    public static final int $stable = 0;
                    private final String msg;

                    public UnAuthorizedUserError(String str) {
                        super(str, null);
                        this.msg = str;
                    }

                    public static /* synthetic */ UnAuthorizedUserError copy$default(UnAuthorizedUserError unAuthorizedUserError, String str, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            str = unAuthorizedUserError.msg;
                        }
                        return unAuthorizedUserError.copy(str);
                    }

                    public final String component1() {
                        return this.msg;
                    }

                    public final UnAuthorizedUserError copy(String str) {
                        return new UnAuthorizedUserError(str);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if ((obj instanceof UnAuthorizedUserError) && o.d(this.msg, ((UnAuthorizedUserError) obj).msg)) {
                            return true;
                        }
                        return false;
                    }

                    public final String getMsg() {
                        return this.msg;
                    }

                    public int hashCode() {
                        String str = this.msg;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }

                    public String toString() {
                        String str = this.msg;
                        return "UnAuthorizedUserError(msg=" + str + ")";
                    }
                }

                /* compiled from: ForSaleDataResult.kt */
                /* loaded from: classes2.dex */
                public static final class UserIsBlockedError extends UserError {
                    public static final int $stable = 0;
                    private final String msg;

                    public UserIsBlockedError(String str) {
                        super(str, null);
                        this.msg = str;
                    }

                    public static /* synthetic */ UserIsBlockedError copy$default(UserIsBlockedError userIsBlockedError, String str, int i11, Object obj) {
                        if ((i11 & 1) != 0) {
                            str = userIsBlockedError.msg;
                        }
                        return userIsBlockedError.copy(str);
                    }

                    public final String component1() {
                        return this.msg;
                    }

                    public final UserIsBlockedError copy(String str) {
                        return new UserIsBlockedError(str);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if ((obj instanceof UserIsBlockedError) && o.d(this.msg, ((UserIsBlockedError) obj).msg)) {
                            return true;
                        }
                        return false;
                    }

                    public final String getMsg() {
                        return this.msg;
                    }

                    public int hashCode() {
                        String str = this.msg;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }

                    public String toString() {
                        String str = this.msg;
                        return "UserIsBlockedError(msg=" + str + ")";
                    }
                }

                public /* synthetic */ UserError(String str, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str);
                }

                public final String getErrorMessage() {
                    return this.errorMessage;
                }

                private UserError(String str) {
                    super(str, null);
                    this.errorMessage = str;
                }
            }

            /* compiled from: ForSaleDataResult.kt */
            /* loaded from: classes2.dex */
            public static final class ValidationError extends ApiError {
                public static final int $stable = 8;
                private final NetworkErrorModel errorBody;

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public ValidationError(com.forsale.app.datalayer.network.errorhandling.NetworkErrorModel r3) {
                    /*
                        r2 = this;
                        r0 = 0
                        if (r3 == 0) goto L8
                        java.lang.String r1 = r3.getMessage()
                        goto L9
                    L8:
                        r1 = r0
                    L9:
                        r2.<init>(r1, r0)
                        r2.errorBody = r3
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult.Error.ApiError.ValidationError.<init>(com.forsale.app.datalayer.network.errorhandling.NetworkErrorModel):void");
                }

                public static /* synthetic */ ValidationError copy$default(ValidationError validationError, NetworkErrorModel networkErrorModel, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        networkErrorModel = validationError.errorBody;
                    }
                    return validationError.copy(networkErrorModel);
                }

                public final NetworkErrorModel component1() {
                    return this.errorBody;
                }

                public final ValidationError copy(NetworkErrorModel networkErrorModel) {
                    return new ValidationError(networkErrorModel);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof ValidationError) && o.d(this.errorBody, ((ValidationError) obj).errorBody)) {
                        return true;
                    }
                    return false;
                }

                public final NetworkErrorModel getErrorBody() {
                    return this.errorBody;
                }

                public int hashCode() {
                    NetworkErrorModel networkErrorModel = this.errorBody;
                    if (networkErrorModel == null) {
                        return 0;
                    }
                    return networkErrorModel.hashCode();
                }

                public String toString() {
                    NetworkErrorModel networkErrorModel = this.errorBody;
                    return "ValidationError(errorBody=" + networkErrorModel + ")";
                }
            }

            public /* synthetic */ ApiError(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            public final String getMessage() {
                return this.message;
            }

            private ApiError(String str) {
                super(str, null);
                this.message = str;
            }
        }

        /* compiled from: ForSaleDataResult.kt */
        /* loaded from: classes2.dex */
        public static final class EmptyResponseError extends Error {
            public static final int $stable = 0;
            public static final EmptyResponseError INSTANCE = new EmptyResponseError();

            private EmptyResponseError() {
                super(null, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EmptyResponseError)) {
                    return false;
                }
                EmptyResponseError emptyResponseError = (EmptyResponseError) obj;
                return true;
            }

            public int hashCode() {
                return -899323529;
            }

            public String toString() {
                return "EmptyResponseError";
            }
        }

        /* compiled from: ForSaleDataResult.kt */
        /* loaded from: classes2.dex */
        public static final class GeneralError extends Error {
            public static final int $stable = 0;
            private final String message;

            public GeneralError(String str) {
                super(str, null);
                this.message = str;
            }

            public static /* synthetic */ GeneralError copy$default(GeneralError generalError, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = generalError.message;
                }
                return generalError.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final GeneralError copy(String str) {
                return new GeneralError(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof GeneralError) && o.d(this.message, ((GeneralError) obj).message)) {
                    return true;
                }
                return false;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.message;
                return "GeneralError(message=" + str + ")";
            }
        }

        /* compiled from: ForSaleDataResult.kt */
        /* loaded from: classes2.dex */
        public static final class InternetConnectionError extends Error {
            public static final int $stable = 0;
            public static final InternetConnectionError INSTANCE = new InternetConnectionError();

            private InternetConnectionError() {
                super(null, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InternetConnectionError)) {
                    return false;
                }
                InternetConnectionError internetConnectionError = (InternetConnectionError) obj;
                return true;
            }

            public int hashCode() {
                return 588603116;
            }

            public String toString() {
                return "InternetConnectionError";
            }
        }

        /* compiled from: ForSaleDataResult.kt */
        /* loaded from: classes2.dex */
        public static abstract class ServerError extends Error {
            public static final int $stable = 0;
            private final String errorMessage;

            /* compiled from: ForSaleDataResult.kt */
            /* loaded from: classes2.dex */
            public static final class UnexpectedError extends ServerError {
                public static final int $stable = 8;
                private final Throwable exception;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnexpectedError(Throwable exception) {
                    super(exception.getMessage(), null);
                    o.i(exception, "exception");
                    this.exception = exception;
                }

                public static /* synthetic */ UnexpectedError copy$default(UnexpectedError unexpectedError, Throwable th2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        th2 = unexpectedError.exception;
                    }
                    return unexpectedError.copy(th2);
                }

                public final Throwable component1() {
                    return this.exception;
                }

                public final UnexpectedError copy(Throwable exception) {
                    o.i(exception, "exception");
                    return new UnexpectedError(exception);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof UnexpectedError) && o.d(this.exception, ((UnexpectedError) obj).exception)) {
                        return true;
                    }
                    return false;
                }

                public final Throwable getException() {
                    return this.exception;
                }

                public int hashCode() {
                    return this.exception.hashCode();
                }

                public String toString() {
                    Throwable th2 = this.exception;
                    return "UnexpectedError(exception=" + th2 + ")";
                }
            }

            public /* synthetic */ ServerError(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            private ServerError(String str) {
                super(str, null);
                this.errorMessage = str;
            }
        }

        public /* synthetic */ Error(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getErrorMsg() {
            return this.errorMsg;
        }

        private Error(String str) {
            this.errorMsg = str;
        }
    }

    /* compiled from: ForSaleDataResult.kt */
    /* loaded from: classes2.dex */
    public static final class Success<T> implements ForSaleDataResult<T> {
        public static final int $stable = 0;
        private final T data;

        public Success(T t11) {
            this.data = t11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        public final Success<T> copy(T t11) {
            return new Success<>(t11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Success) && o.d(this.data, ((Success) obj).data)) {
                return true;
            }
            return false;
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            T t11 = this.data;
            if (t11 == null) {
                return 0;
            }
            return t11.hashCode();
        }

        public String toString() {
            T t11 = this.data;
            return "Success(data=" + t11 + ")";
        }
    }
}
