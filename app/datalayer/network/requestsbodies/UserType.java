package com.forsale.app.datalayer.network.requestsbodies;

import a00.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import kotlin.jvm.internal.o;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GetListingsBody.kt */
/* loaded from: classes2.dex */
public final class UserType implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserType[] $VALUES;
    public static final Parcelable.Creator<UserType> CREATOR;
    private final String value;
    @c("4sale_realty")
    public static final UserType FOR_SALE_REALTY = new UserType("FOR_SALE_REALTY", 0, "4sale_realty");
    @c(Constants.NORMAL)
    public static final UserType NORMAL = new UserType("NORMAL", 1, Constants.NORMAL);
    @c("")
    public static final UserType DEFAULT = new UserType("DEFAULT", 2, "");

    private static final /* synthetic */ UserType[] $values() {
        return new UserType[]{FOR_SALE_REALTY, NORMAL, DEFAULT};
    }

    static {
        UserType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        CREATOR = new Parcelable.Creator<UserType>() { // from class: com.forsale.app.datalayer.network.requestsbodies.UserType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserType createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return UserType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserType[] newArray(int i11) {
                return new UserType[i11];
            }
        };
    }

    private UserType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<UserType> getEntries() {
        return $ENTRIES;
    }

    public static UserType valueOf(String str) {
        return (UserType) Enum.valueOf(UserType.class, str);
    }

    public static UserType[] values() {
        return (UserType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(name());
    }
}
