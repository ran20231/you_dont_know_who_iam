package com.forsale.designSystem.notificationsystem;

import androidx.compose.runtime.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import yj.d;
/* compiled from: InlineAlert.kt */
/* loaded from: classes3.dex */
public abstract class InlineAlertState {

    /* renamed from: a  reason: collision with root package name */
    private final CTAType f41954a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InlineAlert.kt */
    /* loaded from: classes3.dex */
    public static final class CTAType {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CTAType[] $VALUES;
        public static final CTAType Vertical = new CTAType("Vertical", 0);
        public static final CTAType Horizontal = new CTAType("Horizontal", 1);

        private static final /* synthetic */ CTAType[] $values() {
            return new CTAType[]{Vertical, Horizontal};
        }

        static {
            CTAType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CTAType(String str, int i11) {
        }

        public static a00.a<CTAType> getEntries() {
            return $ENTRIES;
        }

        public static CTAType valueOf(String str) {
            return (CTAType) Enum.valueOf(CTAType.class, str);
        }

        public static CTAType[] values() {
            return (CTAType[]) $VALUES.clone();
        }
    }

    /* compiled from: InlineAlert.kt */
    /* loaded from: classes3.dex */
    public static final class a extends InlineAlertState {

        /* renamed from: c  reason: collision with root package name */
        public static final int f41955c = 0;

        /* renamed from: b  reason: collision with root package name */
        private final CTAType f41956b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CTAType ctaType) {
            super(ctaType, null);
            o.i(ctaType, "ctaType");
            this.f41956b = ctaType;
        }

        @Override // com.forsale.designSystem.notificationsystem.InlineAlertState
        public long a(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-707511299);
            if (c.I()) {
                c.U(-707511299, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlertState.Error.<get-backGroundColor> (InlineAlert.kt:266)");
            }
            long h11 = f(aVar, i11 & 14).h(aVar, 0);
            if (c.I()) {
                c.T();
            }
            aVar.S();
            return h11;
        }

        @Override // com.forsale.designSystem.notificationsystem.InlineAlertState
        public CTAType b() {
            return e();
        }

        @Override // com.forsale.designSystem.notificationsystem.InlineAlertState
        public long c(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-1194096229);
            if (c.I()) {
                c.U(-1194096229, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlertState.Error.<get-primaryColor> (InlineAlert.kt:268)");
            }
            long k11 = f(aVar, i11 & 14).k(aVar, 0);
            if (c.I()) {
                c.T();
            }
            aVar.S();
            return k11;
        }

        @Override // com.forsale.designSystem.notificationsystem.InlineAlertState
        public long d(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-1861347813);
            if (c.I()) {
                c.U(-1861347813, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlertState.Error.<get-secondaryColor> (InlineAlert.kt:270)");
            }
            long d11 = f(aVar, i11 & 14).d(aVar, 0);
            if (c.I()) {
                c.T();
            }
            aVar.S();
            return d11;
        }

        public CTAType e() {
            return this.f41956b;
        }

        public d f(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(462543750);
            if (c.I()) {
                c.U(462543750, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlertState.Error.<get-shadedColor> (InlineAlert.kt:264)");
            }
            d d11 = dk.a.f54291a.a(aVar, 6).d();
            if (c.I()) {
                c.T();
            }
            aVar.S();
            return d11;
        }

        public String toString() {
            return "Error";
        }

        public /* synthetic */ a(CTAType cTAType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CTAType.Horizontal : cTAType);
        }
    }

    /* compiled from: InlineAlert.kt */
    /* loaded from: classes3.dex */
    public static final class b extends InlineAlertState {

        /* renamed from: c  reason: collision with root package name */
        public static final int f41957c = 0;

        /* renamed from: b  reason: collision with root package name */
        private final CTAType f41958b;

        public /* synthetic */ b(CTAType cTAType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CTAType.Horizontal : cTAType);
        }

        @Override // com.forsale.designSystem.notificationsystem.InlineAlertState
        public long a(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-1334942039);
            if (c.I()) {
                c.U(-1334942039, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlertState.Warning.<get-backGroundColor> (InlineAlert.kt:249)");
            }
            long h11 = f(aVar, i11 & 14).h(aVar, 0);
            if (c.I()) {
                c.T();
            }
            aVar.S();
            return h11;
        }

        @Override // com.forsale.designSystem.notificationsystem.InlineAlertState
        public CTAType b() {
            return e();
        }

        @Override // com.forsale.designSystem.notificationsystem.InlineAlertState
        public long c(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-791624505);
            if (c.I()) {
                c.U(-791624505, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlertState.Warning.<get-primaryColor> (InlineAlert.kt:251)");
            }
            long k11 = f(aVar, i11 & 14).k(aVar, 0);
            if (c.I()) {
                c.T();
            }
            aVar.S();
            return k11;
        }

        @Override // com.forsale.designSystem.notificationsystem.InlineAlertState
        public long d(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(-2070269625);
            if (c.I()) {
                c.U(-2070269625, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlertState.Warning.<get-secondaryColor> (InlineAlert.kt:253)");
            }
            long d11 = f(aVar, i11 & 14).d(aVar, 0);
            if (c.I()) {
                c.T();
            }
            aVar.S();
            return d11;
        }

        public CTAType e() {
            return this.f41958b;
        }

        public d f(androidx.compose.runtime.a aVar, int i11) {
            aVar.C(2101495794);
            if (c.I()) {
                c.U(2101495794, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlertState.Warning.<get-shadedColor> (InlineAlert.kt:247)");
            }
            d i12 = dk.a.f54291a.a(aVar, 6).i();
            if (c.I()) {
                c.T();
            }
            aVar.S();
            return i12;
        }

        public String toString() {
            return "Warning";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CTAType ctaType) {
            super(ctaType, null);
            o.i(ctaType, "ctaType");
            this.f41958b = ctaType;
        }
    }

    public /* synthetic */ InlineAlertState(CTAType cTAType, DefaultConstructorMarker defaultConstructorMarker) {
        this(cTAType);
    }

    public abstract long a(androidx.compose.runtime.a aVar, int i11);

    public abstract CTAType b();

    public abstract long c(androidx.compose.runtime.a aVar, int i11);

    public abstract long d(androidx.compose.runtime.a aVar, int i11);

    private InlineAlertState(CTAType cTAType) {
        this.f41954a = cTAType;
    }
}
