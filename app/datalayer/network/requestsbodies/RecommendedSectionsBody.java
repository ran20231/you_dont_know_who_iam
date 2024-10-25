package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: RecommendedSectionsBody.kt */
/* loaded from: classes2.dex */
public final class RecommendedSectionsBody {
    public static final int $stable = 0;
    @c("cat_id")
    private final int categoryId;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    @c("lang")
    private final String language;

    public RecommendedSectionsBody(String deviceId, int i11, String language) {
        o.i(deviceId, "deviceId");
        o.i(language, "language");
        this.deviceId = deviceId;
        this.categoryId = i11;
        this.language = language;
    }

    public static /* synthetic */ RecommendedSectionsBody copy$default(RecommendedSectionsBody recommendedSectionsBody, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = recommendedSectionsBody.deviceId;
        }
        if ((i12 & 2) != 0) {
            i11 = recommendedSectionsBody.categoryId;
        }
        if ((i12 & 4) != 0) {
            str2 = recommendedSectionsBody.language;
        }
        return recommendedSectionsBody.copy(str, i11, str2);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final int component2() {
        return this.categoryId;
    }

    public final String component3() {
        return this.language;
    }

    public final RecommendedSectionsBody copy(String deviceId, int i11, String language) {
        o.i(deviceId, "deviceId");
        o.i(language, "language");
        return new RecommendedSectionsBody(deviceId, i11, language);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedSectionsBody)) {
            return false;
        }
        RecommendedSectionsBody recommendedSectionsBody = (RecommendedSectionsBody) obj;
        if (o.d(this.deviceId, recommendedSectionsBody.deviceId) && this.categoryId == recommendedSectionsBody.categoryId && o.d(this.language, recommendedSectionsBody.language)) {
            return true;
        }
        return false;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getLanguage() {
        return this.language;
    }

    public int hashCode() {
        return (((this.deviceId.hashCode() * 31) + Integer.hashCode(this.categoryId)) * 31) + this.language.hashCode();
    }

    public String toString() {
        String str = this.deviceId;
        int i11 = this.categoryId;
        String str2 = this.language;
        return "RecommendedSectionsBody(deviceId=" + str + ", categoryId=" + i11 + ", language=" + str2 + ")";
    }
}
