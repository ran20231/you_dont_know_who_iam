package com.forsale.app.datalayer.network.entities.errors;

import com.leanplum.internal.Constants;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ValidationErrorModel.kt */
/* loaded from: classes2.dex */
public final class ValidationErrorModel {
    public static final int $stable = 8;
    @c("errors")
    private final Map<String, List<String>> errors;
    @c(Constants.Params.MESSAGE)
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationErrorModel(String str, Map<String, ? extends List<String>> map) {
        this.message = str;
        this.errors = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ValidationErrorModel copy$default(ValidationErrorModel validationErrorModel, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = validationErrorModel.message;
        }
        if ((i11 & 2) != 0) {
            map = validationErrorModel.errors;
        }
        return validationErrorModel.copy(str, map);
    }

    public final String component1() {
        return this.message;
    }

    public final Map<String, List<String>> component2() {
        return this.errors;
    }

    public final ValidationErrorModel copy(String str, Map<String, ? extends List<String>> map) {
        return new ValidationErrorModel(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationErrorModel)) {
            return false;
        }
        ValidationErrorModel validationErrorModel = (ValidationErrorModel) obj;
        if (o.d(this.message, validationErrorModel.message) && o.d(this.errors, validationErrorModel.errors)) {
            return true;
        }
        return false;
    }

    public final Map<String, List<String>> getErrors() {
        return this.errors;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode;
        String str = this.message;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        Map<String, List<String>> map = this.errors;
        if (map != null) {
            i11 = map.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        String str = this.message;
        Map<String, List<String>> map = this.errors;
        return "ValidationErrorModel(message=" + str + ", errors=" + map + ")";
    }
}
