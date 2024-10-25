package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents;

import com.forsale.app.datalayer.network.entities.PostListingIntention;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SellerActionType.kt */
/* loaded from: classes2.dex */
public final class SellerActionType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ SellerActionType[] $VALUES;
    public static final a Companion;
    public static final SellerActionType EDIT = new SellerActionType("EDIT", 0);
    public static final SellerActionType DELETE = new SellerActionType("DELETE", 1);
    public static final SellerActionType AUTO_RE_POST = new SellerActionType("AUTO_RE_POST", 2);
    public static final SellerActionType MANUAL_RE_POST = new SellerActionType("MANUAL_RE_POST", 3);
    public static final SellerActionType HIDE_MY_NUMBER = new SellerActionType("HIDE_MY_NUMBER", 4);
    public static final SellerActionType ADD_ADDITIONAL_NUMBER = new SellerActionType("ADD_ADDITIONAL_NUMBER", 5);
    public static final SellerActionType EXPIRE_SOON_DELETE = new SellerActionType("EXPIRE_SOON_DELETE", 6);
    public static final SellerActionType EXPIRE_SOON_BOOST = new SellerActionType("EXPIRE_SOON_BOOST", 7);
    public static final SellerActionType EXPIRE_SOON_RE_POST = new SellerActionType("EXPIRE_SOON_RE_POST", 8);

    /* compiled from: SellerActionType.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: SellerActionType.kt */
        /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0295a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f27618a;

            static {
                int[] iArr = new int[PostListingIntention.values().length];
                try {
                    iArr[PostListingIntention.BOOST_LISTING_ABOUT_TO_EXPIRE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PostListingIntention.RE_POST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f27618a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SellerActionType a(PostListingIntention postListingIntention) {
            int i11;
            if (postListingIntention == null) {
                i11 = -1;
            } else {
                i11 = C0295a.f27618a[postListingIntention.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                return SellerActionType.EXPIRE_SOON_RE_POST;
            }
            return SellerActionType.EXPIRE_SOON_BOOST;
        }
    }

    private static final /* synthetic */ SellerActionType[] $values() {
        return new SellerActionType[]{EDIT, DELETE, AUTO_RE_POST, MANUAL_RE_POST, HIDE_MY_NUMBER, ADD_ADDITIONAL_NUMBER, EXPIRE_SOON_DELETE, EXPIRE_SOON_BOOST, EXPIRE_SOON_RE_POST};
    }

    static {
        SellerActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private SellerActionType(String str, int i11) {
    }

    public static a00.a<SellerActionType> getEntries() {
        return $ENTRIES;
    }

    public static SellerActionType valueOf(String str) {
        return (SellerActionType) Enum.valueOf(SellerActionType.class, str);
    }

    public static SellerActionType[] values() {
        return (SellerActionType[]) $VALUES.clone();
    }
}
