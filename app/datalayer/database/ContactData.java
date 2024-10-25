package com.forsale.app.datalayer.database;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ContactData.kt */
/* loaded from: classes2.dex */
public final class ContactData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String PHONE = "phone";
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    @c("phone")
    private final String phone;

    /* compiled from: ContactData.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ContactData(String nameAr, String nameEn, String phone) {
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        o.i(phone, "phone");
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.phone = phone;
    }

    public static /* synthetic */ ContactData copy$default(ContactData contactData, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contactData.nameAr;
        }
        if ((i11 & 2) != 0) {
            str2 = contactData.nameEn;
        }
        if ((i11 & 4) != 0) {
            str3 = contactData.phone;
        }
        return contactData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.nameAr;
    }

    public final String component2() {
        return this.nameEn;
    }

    public final String component3() {
        return this.phone;
    }

    public final ContactData copy(String nameAr, String nameEn, String phone) {
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        o.i(phone, "phone");
        return new ContactData(nameAr, nameEn, phone);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactData)) {
            return false;
        }
        ContactData contactData = (ContactData) obj;
        if (o.d(this.nameAr, contactData.nameAr) && o.d(this.nameEn, contactData.nameEn) && o.d(this.phone, contactData.phone)) {
            return true;
        }
        return false;
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

    public int hashCode() {
        return (((this.nameAr.hashCode() * 31) + this.nameEn.hashCode()) * 31) + this.phone.hashCode();
    }

    public String toString() {
        String str = this.nameAr;
        String str2 = this.nameEn;
        String str3 = this.phone;
        return "ContactData(nameAr=" + str + ", nameEn=" + str2 + ", phone=" + str3 + ")";
    }
}
