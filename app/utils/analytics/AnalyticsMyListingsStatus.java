package com.forsale.app.utils.analytics;

import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsMyListingsStatus.kt */
/* loaded from: classes3.dex */
public final class AnalyticsMyListingsStatus {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AnalyticsMyListingsStatus[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final AnalyticsMyListingsStatus LIVE = new AnalyticsMyListingsStatus("LIVE", 0, "Live");
    public static final AnalyticsMyListingsStatus DRAFT = new AnalyticsMyListingsStatus("DRAFT", 1, "Draft");
    public static final AnalyticsMyListingsStatus ARCHIVED = new AnalyticsMyListingsStatus("ARCHIVED", 2, "Archived");
    public static final AnalyticsMyListingsStatus WAITING_APPROVAL = new AnalyticsMyListingsStatus("WAITING_APPROVAL", 3, "WaitingApproval");

    /* compiled from: AnalyticsMyListingsStatus.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: AnalyticsMyListingsStatus.kt */
        /* renamed from: com.forsale.app.utils.analytics.AnalyticsMyListingsStatus$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0453a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f39973a;

            static {
                int[] iArr = new int[MyListingsType.values().length];
                try {
                    iArr[MyListingsType.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MyListingsType.ARCHIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MyListingsType.WAITING_APPROVAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f39973a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AnalyticsMyListingsStatus a(MyListingsType myListingsType) {
            o.i(myListingsType, "myListingsType");
            int i11 = C0453a.f39973a[myListingsType.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return AnalyticsMyListingsStatus.WAITING_APPROVAL;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return AnalyticsMyListingsStatus.ARCHIVED;
            }
            return AnalyticsMyListingsStatus.LIVE;
        }
    }

    private static final /* synthetic */ AnalyticsMyListingsStatus[] $values() {
        return new AnalyticsMyListingsStatus[]{LIVE, DRAFT, ARCHIVED, WAITING_APPROVAL};
    }

    static {
        AnalyticsMyListingsStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private AnalyticsMyListingsStatus(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AnalyticsMyListingsStatus> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsMyListingsStatus valueOf(String str) {
        return (AnalyticsMyListingsStatus) Enum.valueOf(AnalyticsMyListingsStatus.class, str);
    }

    public static AnalyticsMyListingsStatus[] values() {
        return (AnalyticsMyListingsStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
