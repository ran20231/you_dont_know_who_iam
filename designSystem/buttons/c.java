package com.forsale.designSystem.buttons;

import androidx.compose.foundation.layout.PaddingKt;
import b1.s4;
import c0.f;
import c0.g;
import e2.h;
import e2.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: IconButton.kt */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41201a = new a(null);

    /* compiled from: IconButton.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: IconButton.kt */
        /* renamed from: com.forsale.designSystem.buttons.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0466a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f41202a;

            static {
                int[] iArr = new int[IconButtonSize.values().length];
                try {
                    iArr[IconButtonSize.Small.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IconButtonSize.Medium.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IconButtonSize.Large.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f41202a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(IconButtonShape shape, IconButtonSize size) {
            o.i(shape, "shape");
            o.i(size, "size");
            int i11 = C0466a.f41202a[size.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return new b(shape);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return new C0467c(shape);
            }
            return new d(shape);
        }
    }

    /* compiled from: IconButton.kt */
    /* loaded from: classes3.dex */
    private static final class b extends c {

        /* renamed from: b  reason: collision with root package name */
        private final IconButtonShape f41203b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IconButtonShape iconButtonShapes) {
            super(null);
            o.i(iconButtonShapes, "iconButtonShapes");
            this.f41203b = iconButtonShapes;
        }

        @Override // com.forsale.designSystem.buttons.c
        public long a() {
            if (this.f41203b == IconButtonShape.Rectangle) {
                return i.b(h.l(56), h.l(48));
            }
            float f11 = 48;
            return i.b(h.l(f11), h.l(f11));
        }

        @Override // com.forsale.designSystem.buttons.c
        public w.o b() {
            if (this.f41203b == IconButtonShape.Rectangle) {
                return PaddingKt.b(h.l(16), h.l(12));
            }
            return PaddingKt.a(h.l(12));
        }

        @Override // com.forsale.designSystem.buttons.c
        public float c() {
            return h.l(24);
        }

        @Override // com.forsale.designSystem.buttons.c
        public float d() {
            return h.l(8);
        }

        @Override // com.forsale.designSystem.buttons.c
        public s4 e() {
            return f(this.f41203b);
        }
    }

    /* compiled from: IconButton.kt */
    /* renamed from: com.forsale.designSystem.buttons.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0467c extends c {

        /* renamed from: b  reason: collision with root package name */
        private final IconButtonShape f41204b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0467c(IconButtonShape iconButtonShapes) {
            super(null);
            o.i(iconButtonShapes, "iconButtonShapes");
            this.f41204b = iconButtonShapes;
        }

        @Override // com.forsale.designSystem.buttons.c
        public long a() {
            if (this.f41204b == IconButtonShape.Rectangle) {
                return i.b(h.l(44), h.l(40));
            }
            float f11 = 40;
            return i.b(h.l(f11), h.l(f11));
        }

        @Override // com.forsale.designSystem.buttons.c
        public w.o b() {
            if (this.f41204b == IconButtonShape.Rectangle) {
                return PaddingKt.b(h.l(12), h.l(10));
            }
            return PaddingKt.a(h.l(12));
        }

        @Override // com.forsale.designSystem.buttons.c
        public float c() {
            return h.l(20);
        }

        @Override // com.forsale.designSystem.buttons.c
        public float d() {
            return h.l(6);
        }

        @Override // com.forsale.designSystem.buttons.c
        public s4 e() {
            return f(this.f41204b);
        }
    }

    /* compiled from: IconButton.kt */
    /* loaded from: classes3.dex */
    private static final class d extends c {

        /* renamed from: b  reason: collision with root package name */
        private final IconButtonShape f41205b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IconButtonShape iconButtonShapes) {
            super(null);
            o.i(iconButtonShapes, "iconButtonShapes");
            this.f41205b = iconButtonShapes;
        }

        @Override // com.forsale.designSystem.buttons.c
        public long a() {
            float f11 = 32;
            return i.b(h.l(f11), h.l(f11));
        }

        @Override // com.forsale.designSystem.buttons.c
        public w.o b() {
            return PaddingKt.a(h.l(8));
        }

        @Override // com.forsale.designSystem.buttons.c
        public float c() {
            return h.l(16);
        }

        @Override // com.forsale.designSystem.buttons.c
        public float d() {
            return h.l(4);
        }

        @Override // com.forsale.designSystem.buttons.c
        public s4 e() {
            return f(this.f41205b);
        }
    }

    /* compiled from: IconButton.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41206a;

        static {
            int[] iArr = new int[IconButtonShape.values().length];
            try {
                iArr[IconButtonShape.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconButtonShape.Circle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconButtonShape.Rectangle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41206a = iArr;
        }
    }

    private c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long a();

    public abstract w.o b();

    public abstract float c();

    public abstract float d();

    public abstract s4 e();

    public final f f(IconButtonShape iconButtonShape) {
        o.i(iconButtonShape, "iconButtonShape");
        int i11 = e.f41206a[iconButtonShape.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return g.c(d());
                }
                throw new NoWhenBranchMatchedException();
            }
            return g.f();
        }
        return g.c(d());
    }
}
