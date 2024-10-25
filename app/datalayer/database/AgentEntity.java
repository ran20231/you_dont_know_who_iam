package com.forsale.app.datalayer.database;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AgentEntity.kt */
/* loaded from: classes2.dex */
public final class AgentEntity {
    public static final String AGENTS_TABLE = "agents";
    public static final String DESCRIPTION_AR = "description_ar";
    public static final String DESCRIPTION_EN = "description_en";
    public static final String DISPLAY_ORDER = "display_order";
    public static final String EMAIL = "email";
    public static final String ID = "id";
    public static final String IMAGE = "image";
    public static final String IS_ACTIVE = "is_active";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String PHONE = "phone";
    public static final String REGION_ID = "region_id";
    @c(DESCRIPTION_AR)
    private final String descriptionAr;
    @c(DESCRIPTION_EN)
    private final String descriptionEn;
    @c("display_order")
    private final int displayOrder;
    @c("email")
    private final String email;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22298id;
    @c("image")
    private final String image;
    @c("is_active")
    private int isActive;
    @c("is_indexed")
    private final Integer isIndexed;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    @c("phone")
    private final String phone;
    @c("region_id")
    private final int regionId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AgentEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AgentEntity(int i11, String nameAr, String nameEn, String descriptionAr, String descriptionEn, String phone, String image, String email, int i12, int i13, Integer num) {
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        o.i(descriptionAr, "descriptionAr");
        o.i(descriptionEn, "descriptionEn");
        o.i(phone, "phone");
        o.i(image, "image");
        o.i(email, "email");
        this.f22298id = i11;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.descriptionAr = descriptionAr;
        this.descriptionEn = descriptionEn;
        this.phone = phone;
        this.image = image;
        this.email = email;
        this.regionId = i12;
        this.displayOrder = i13;
        this.isIndexed = num;
        this.isActive = 1;
    }

    public static /* synthetic */ AgentEntity copy$default(AgentEntity agentEntity, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i12, int i13, Integer num, int i14, Object obj) {
        int i15;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i16;
        int i17;
        Integer num2;
        if ((i14 & 1) != 0) {
            i15 = agentEntity.f22298id;
        } else {
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            str8 = agentEntity.nameAr;
        } else {
            str8 = str;
        }
        if ((i14 & 4) != 0) {
            str9 = agentEntity.nameEn;
        } else {
            str9 = str2;
        }
        if ((i14 & 8) != 0) {
            str10 = agentEntity.descriptionAr;
        } else {
            str10 = str3;
        }
        if ((i14 & 16) != 0) {
            str11 = agentEntity.descriptionEn;
        } else {
            str11 = str4;
        }
        if ((i14 & 32) != 0) {
            str12 = agentEntity.phone;
        } else {
            str12 = str5;
        }
        if ((i14 & 64) != 0) {
            str13 = agentEntity.image;
        } else {
            str13 = str6;
        }
        if ((i14 & 128) != 0) {
            str14 = agentEntity.email;
        } else {
            str14 = str7;
        }
        if ((i14 & 256) != 0) {
            i16 = agentEntity.regionId;
        } else {
            i16 = i12;
        }
        if ((i14 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            i17 = agentEntity.displayOrder;
        } else {
            i17 = i13;
        }
        if ((i14 & 1024) != 0) {
            num2 = agentEntity.isIndexed;
        } else {
            num2 = num;
        }
        return agentEntity.copy(i15, str8, str9, str10, str11, str12, str13, str14, i16, i17, num2);
    }

    public final int component1() {
        return this.f22298id;
    }

    public final int component10() {
        return this.displayOrder;
    }

    public final Integer component11() {
        return this.isIndexed;
    }

    public final String component2() {
        return this.nameAr;
    }

    public final String component3() {
        return this.nameEn;
    }

    public final String component4() {
        return this.descriptionAr;
    }

    public final String component5() {
        return this.descriptionEn;
    }

    public final String component6() {
        return this.phone;
    }

    public final String component7() {
        return this.image;
    }

    public final String component8() {
        return this.email;
    }

    public final int component9() {
        return this.regionId;
    }

    public final AgentEntity copy(int i11, String nameAr, String nameEn, String descriptionAr, String descriptionEn, String phone, String image, String email, int i12, int i13, Integer num) {
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        o.i(descriptionAr, "descriptionAr");
        o.i(descriptionEn, "descriptionEn");
        o.i(phone, "phone");
        o.i(image, "image");
        o.i(email, "email");
        return new AgentEntity(i11, nameAr, nameEn, descriptionAr, descriptionEn, phone, image, email, i12, i13, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentEntity)) {
            return false;
        }
        AgentEntity agentEntity = (AgentEntity) obj;
        if (this.f22298id == agentEntity.f22298id && o.d(this.nameAr, agentEntity.nameAr) && o.d(this.nameEn, agentEntity.nameEn) && o.d(this.descriptionAr, agentEntity.descriptionAr) && o.d(this.descriptionEn, agentEntity.descriptionEn) && o.d(this.phone, agentEntity.phone) && o.d(this.image, agentEntity.image) && o.d(this.email, agentEntity.email) && this.regionId == agentEntity.regionId && this.displayOrder == agentEntity.displayOrder && o.d(this.isIndexed, agentEntity.isIndexed)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            return this.descriptionEn;
        }
        return this.descriptionAr;
    }

    public final String getDescriptionAr() {
        return this.descriptionAr;
    }

    public final String getDescriptionEn() {
        return this.descriptionEn;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getEmail() {
        return this.email;
    }

    public final int getId() {
        return this.f22298id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            return this.nameEn;
        }
        return this.nameAr;
    }

    public final String getNameAr() {
        return this.nameAr;
    }

    public final String getNameEn() {
        return this.nameEn;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((((Integer.hashCode(this.f22298id) * 31) + this.nameAr.hashCode()) * 31) + this.nameEn.hashCode()) * 31) + this.descriptionAr.hashCode()) * 31) + this.descriptionEn.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.image.hashCode()) * 31) + this.email.hashCode()) * 31) + Integer.hashCode(this.regionId)) * 31) + Integer.hashCode(this.displayOrder)) * 31;
        Integer num = this.isIndexed;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final int isActive() {
        return this.isActive;
    }

    public final Integer isIndexed() {
        return this.isIndexed;
    }

    public final void setActive(int i11) {
        this.isActive = i11;
    }

    public String toString() {
        int i11 = this.f22298id;
        String str = this.nameAr;
        String str2 = this.nameEn;
        String str3 = this.descriptionAr;
        String str4 = this.descriptionEn;
        String str5 = this.phone;
        String str6 = this.image;
        String str7 = this.email;
        int i12 = this.regionId;
        int i13 = this.displayOrder;
        Integer num = this.isIndexed;
        return "AgentEntity(id=" + i11 + ", nameAr=" + str + ", nameEn=" + str2 + ", descriptionAr=" + str3 + ", descriptionEn=" + str4 + ", phone=" + str5 + ", image=" + str6 + ", email=" + str7 + ", regionId=" + i12 + ", displayOrder=" + i13 + ", isIndexed=" + num + ")";
    }

    public /* synthetic */ AgentEntity(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i12, int i13, Integer num, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, str5, str6, str7, i12, i13, (i14 & 1024) != 0 ? 0 : num);
    }
}
