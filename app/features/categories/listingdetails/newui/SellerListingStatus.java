package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingArchivedBy;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SellerListingStatus.kt */
/* loaded from: classes2.dex */
public final class SellerListingStatus {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ SellerListingStatus[] $VALUES;
    public static final a Companion;
    public static final SellerListingStatus ACTIVE = new SellerListingStatus("ACTIVE", 0);
    public static final SellerListingStatus ARCHIVED_BY_USER = new SellerListingStatus("ARCHIVED_BY_USER", 1);
    public static final SellerListingStatus ARCHIVED_BY_ADMIN = new SellerListingStatus("ARCHIVED_BY_ADMIN", 2);
    public static final SellerListingStatus QUARANTINE = new SellerListingStatus("QUARANTINE", 3);
    public static final SellerListingStatus NONE = new SellerListingStatus("NONE", 4);

    /* compiled from: SellerListingStatus.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: SellerListingStatus.kt */
        /* renamed from: com.forsale.app.features.categories.listingdetails.newui.SellerListingStatus$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0292a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f27329a;

            static {
                int[] iArr = new int[ListingType.values().length];
                try {
                    iArr[ListingType.ARCHIVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ListingType.ACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f27329a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SellerListingStatus a(boolean z11, ItemStatus status, ListingType listingType, ListingArchivedBy listingArchivedBy) {
            int i11;
            o.i(status, "status");
            if (z11) {
                if (listingType == null) {
                    i11 = -1;
                } else {
                    i11 = C0292a.f27329a[listingType.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        return SellerListingStatus.NONE;
                    }
                    if (status == ItemStatus.QUARANTINE) {
                        return SellerListingStatus.QUARANTINE;
                    }
                    return SellerListingStatus.ACTIVE;
                } else if (listingArchivedBy == ListingArchivedBy.ADMIN) {
                    return SellerListingStatus.ARCHIVED_BY_ADMIN;
                } else {
                    return SellerListingStatus.ARCHIVED_BY_USER;
                }
            }
            return SellerListingStatus.NONE;
        }
    }

    private static final /* synthetic */ SellerListingStatus[] $values() {
        return new SellerListingStatus[]{ACTIVE, ARCHIVED_BY_USER, ARCHIVED_BY_ADMIN, QUARANTINE, NONE};
    }

    static {
        SellerListingStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private SellerListingStatus(String str, int i11) {
    }

    public static a00.a<SellerListingStatus> getEntries() {
        return $ENTRIES;
    }

    public static SellerListingStatus valueOf(String str) {
        return (SellerListingStatus) Enum.valueOf(SellerListingStatus.class, str);
    }

    public static SellerListingStatus[] values() {
        return (SellerListingStatus[]) $VALUES.clone();
    }
}
