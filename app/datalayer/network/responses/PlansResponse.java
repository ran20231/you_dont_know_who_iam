package com.forsale.app.datalayer.network.responses;

import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: PlansResponse.kt */
/* loaded from: classes2.dex */
public final class PlansResponse {
    public static final int $stable = 8;
    @c("description")
    private final String description;
    @c("plans")
    private final List<Plan> plans;
    @c("read_more_url")
    private final String readMoreUrl;

    /* compiled from: PlansResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Plan {
        public static final int $stable = 0;
        @c("extend_period")
        private final Integer extendPeriod;
        @c("features_list")
        private final String featuresList;
        @c("id")

        /* renamed from: id  reason: collision with root package name */
        private final Integer f22361id;
        @c("is_active")
        private final Integer isActive;
        @c("is_default")
        private final Integer isDefault;
        @c("is_free")
        private final Integer isFree;
        @c("name")
        private final String planName;
        @c("price")
        private final Float price;

        public Plan(String str, Integer num, Integer num2, Integer num3, String str2, Float f11, Integer num4, Integer num5) {
            this.featuresList = str;
            this.f22361id = num;
            this.isActive = num2;
            this.isDefault = num3;
            this.planName = str2;
            this.price = f11;
            this.isFree = num4;
            this.extendPeriod = num5;
        }

        public static /* synthetic */ Plan copy$default(Plan plan, String str, Integer num, Integer num2, Integer num3, String str2, Float f11, Integer num4, Integer num5, int i11, Object obj) {
            String str3;
            Integer num6;
            Integer num7;
            Integer num8;
            String str4;
            Float f12;
            Integer num9;
            Integer num10;
            if ((i11 & 1) != 0) {
                str3 = plan.featuresList;
            } else {
                str3 = str;
            }
            if ((i11 & 2) != 0) {
                num6 = plan.f22361id;
            } else {
                num6 = num;
            }
            if ((i11 & 4) != 0) {
                num7 = plan.isActive;
            } else {
                num7 = num2;
            }
            if ((i11 & 8) != 0) {
                num8 = plan.isDefault;
            } else {
                num8 = num3;
            }
            if ((i11 & 16) != 0) {
                str4 = plan.planName;
            } else {
                str4 = str2;
            }
            if ((i11 & 32) != 0) {
                f12 = plan.price;
            } else {
                f12 = f11;
            }
            if ((i11 & 64) != 0) {
                num9 = plan.isFree;
            } else {
                num9 = num4;
            }
            if ((i11 & 128) != 0) {
                num10 = plan.extendPeriod;
            } else {
                num10 = num5;
            }
            return plan.copy(str3, num6, num7, num8, str4, f12, num9, num10);
        }

        public final String component1() {
            return this.featuresList;
        }

        public final Integer component2() {
            return this.f22361id;
        }

        public final Integer component3() {
            return this.isActive;
        }

        public final Integer component4() {
            return this.isDefault;
        }

        public final String component5() {
            return this.planName;
        }

        public final Float component6() {
            return this.price;
        }

        public final Integer component7() {
            return this.isFree;
        }

        public final Integer component8() {
            return this.extendPeriod;
        }

        public final Plan copy(String str, Integer num, Integer num2, Integer num3, String str2, Float f11, Integer num4, Integer num5) {
            return new Plan(str, num, num2, num3, str2, f11, num4, num5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Plan)) {
                return false;
            }
            Plan plan = (Plan) obj;
            if (o.d(this.featuresList, plan.featuresList) && o.d(this.f22361id, plan.f22361id) && o.d(this.isActive, plan.isActive) && o.d(this.isDefault, plan.isDefault) && o.d(this.planName, plan.planName) && o.d(this.price, plan.price) && o.d(this.isFree, plan.isFree) && o.d(this.extendPeriod, plan.extendPeriod)) {
                return true;
            }
            return false;
        }

        public final Integer getExtendPeriod() {
            return this.extendPeriod;
        }

        public final String getFeaturesList() {
            return this.featuresList;
        }

        public final Integer getId() {
            return this.f22361id;
        }

        public final String getPlanName() {
            return this.planName;
        }

        public final Float getPrice() {
            return this.price;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            String str = this.featuresList;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            Integer num = this.f22361id;
            if (num == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            Integer num2 = this.isActive;
            if (num2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = num2.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            Integer num3 = this.isDefault;
            if (num3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = num3.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str2 = this.planName;
            if (str2 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str2.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            Float f11 = this.price;
            if (f11 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = f11.hashCode();
            }
            int i17 = (i16 + hashCode6) * 31;
            Integer num4 = this.isFree;
            if (num4 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = num4.hashCode();
            }
            int i18 = (i17 + hashCode7) * 31;
            Integer num5 = this.extendPeriod;
            if (num5 != null) {
                i11 = num5.hashCode();
            }
            return i18 + i11;
        }

        public final Integer isActive() {
            return this.isActive;
        }

        public final Integer isDefault() {
            return this.isDefault;
        }

        public final Integer isFree() {
            return this.isFree;
        }

        public String toString() {
            String str = this.featuresList;
            Integer num = this.f22361id;
            Integer num2 = this.isActive;
            Integer num3 = this.isDefault;
            String str2 = this.planName;
            Float f11 = this.price;
            Integer num4 = this.isFree;
            Integer num5 = this.extendPeriod;
            return "Plan(featuresList=" + str + ", id=" + num + ", isActive=" + num2 + ", isDefault=" + num3 + ", planName=" + str2 + ", price=" + f11 + ", isFree=" + num4 + ", extendPeriod=" + num5 + ")";
        }
    }

    public PlansResponse(String str, List<Plan> plans, String str2) {
        o.i(plans, "plans");
        this.description = str;
        this.plans = plans;
        this.readMoreUrl = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlansResponse copy$default(PlansResponse plansResponse, String str, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = plansResponse.description;
        }
        if ((i11 & 2) != 0) {
            list = plansResponse.plans;
        }
        if ((i11 & 4) != 0) {
            str2 = plansResponse.readMoreUrl;
        }
        return plansResponse.copy(str, list, str2);
    }

    public final String component1() {
        return this.description;
    }

    public final List<Plan> component2() {
        return this.plans;
    }

    public final String component3() {
        return this.readMoreUrl;
    }

    public final PlansResponse copy(String str, List<Plan> plans, String str2) {
        o.i(plans, "plans");
        return new PlansResponse(str, plans, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlansResponse)) {
            return false;
        }
        PlansResponse plansResponse = (PlansResponse) obj;
        if (o.d(this.description, plansResponse.description) && o.d(this.plans, plansResponse.plans) && o.d(this.readMoreUrl, plansResponse.readMoreUrl)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<Plan> getPlans() {
        return this.plans;
    }

    public final String getReadMoreUrl() {
        return this.readMoreUrl;
    }

    public int hashCode() {
        int hashCode;
        String str = this.description;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.plans.hashCode()) * 31;
        String str2 = this.readMoreUrl;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        String str = this.description;
        List<Plan> list = this.plans;
        String str2 = this.readMoreUrl;
        return "PlansResponse(description=" + str + ", plans=" + list + ", readMoreUrl=" + str2 + ")";
    }

    public /* synthetic */ PlansResponse(String str, List list, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? r.n() : list, str2);
    }
}
