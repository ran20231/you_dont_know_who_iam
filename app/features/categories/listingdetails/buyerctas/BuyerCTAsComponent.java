package com.forsale.app.features.categories.listingdetails.buyerctas;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import b1.t1;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.buttons.IconButtonKt;
import com.forsale.designSystem.buttons.IconButtonShape;
import com.forsale.designSystem.buttons.IconButtonSize;
import com.leanplum.internal.ResourceQualifiers;
import e2.h;
import j0.d1;
import j0.v0;
import kotlin.jvm.internal.o;
import p1.e;
import t9.q0;
import wz.p;
import yj.d;
/* compiled from: BuyerCTAsComponent.kt */
/* loaded from: classes2.dex */
public final class BuyerCTAsComponent {

    /* renamed from: a  reason: collision with root package name */
    public static final BuyerCTAsComponent f25455a = new BuyerCTAsComponent();

    /* compiled from: BuyerCTAsComponent.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25469a;

        static {
            int[] iArr = new int[BuyerCTAsState.values().length];
            try {
                iArr[BuyerCTAsState.CHAT_ACTION_STICKY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25469a = iArr;
        }
    }

    private BuyerCTAsComponent() {
    }

    public final void a(final c modifier, final g00.a<p> onClick, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        int i14;
        o.i(modifier, "modifier");
        o.i(onClick, "onClick");
        androidx.compose.runtime.a h11 = aVar.h(-1372571156);
        if ((i11 & 14) == 0) {
            if (h11.T(modifier)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onClick)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1372571156, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.BuyerCTAsComponent.CallNowButton (BuyerCTAsComponent.kt:26)");
            }
            aVar2 = h11;
            ButtonsKt.d(onClick, modifier, ButtonData.f40994a.a(), null, null, null, null, false, null, PaddingKt.a(h.l(8)), ComposableSingletons$BuyerCTAsComponentKt.f25515a.a(), h11, ((i12 >> 3) & 14) | 805306368 | ((i12 << 3) & 112) | (ButtonData.f40995b << 6), 6, 504);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerCTAsComponent$CallNowButton$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar3, int i15) {
                    BuyerCTAsComponent.this.a(modifier, onClick, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void b(final BuyerCTAsState buttonState, final c modifier, final g00.a<p> onClick, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        int i14;
        int i15;
        o.i(buttonState, "buttonState");
        o.i(modifier, "modifier");
        o.i(onClick, "onClick");
        androidx.compose.runtime.a h11 = aVar.h(259457466);
        if ((i11 & 14) == 0) {
            if (h11.T(buttonState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onClick)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(259457466, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.BuyerCTAsComponent.ChatIconButton (BuyerCTAsComponent.kt:55)");
            }
            if (a.f25469a[buttonState.ordinal()] == 1) {
                h11.C(-499190995);
                IconButtonSize iconButtonSize = IconButtonSize.Large;
                IconButtonKt.a(onClick, e.d(q0.f69809v, h11, 0), IconButtonShape.Square, iconButtonSize, dk.a.f54291a.a(h11, dk.a.f54292b).f().l(h11, d.f76453b), modifier, false, null, t1.g(t1.f15974b.f()), h11, ((i12 >> 6) & 14) | 100666816 | ((i12 << 12) & 458752), ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK);
                h11.S();
                aVar2 = h11;
            } else {
                h11.C(-499190533);
                ButtonData a11 = ButtonData.f40994a.a();
                dk.a aVar3 = dk.a.f54291a;
                int i16 = dk.a.f54292b;
                d f11 = aVar3.a(h11, i16).f();
                int i17 = d.f76453b;
                long l11 = f11.l(h11, i17);
                long m11 = aVar3.a(h11, i16).f().m(h11, i17);
                long m12 = aVar3.a(h11, i16).f().m(h11, i17);
                aVar2 = h11;
                ButtonsKt.d(onClick, modifier, a11, null, t1.g(l11), t1.g(m11), t1.g(m12), false, null, PaddingKt.a(h.l(8)), ComposableSingletons$BuyerCTAsComponentKt.f25515a.c(), h11, ((i12 >> 6) & 14) | 805306368 | (i12 & 112) | (ButtonData.f40995b << 6), 6, 392);
                aVar2.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l12 = aVar2.l();
        if (l12 != null) {
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerCTAsComponent$ChatIconButton$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i18) {
                    BuyerCTAsComponent.this.b(buttonState, modifier, onClick, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public final void c(final c modifier, final g00.a<p> onClick, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        int i14;
        o.i(modifier, "modifier");
        o.i(onClick, "onClick");
        androidx.compose.runtime.a h11 = aVar.h(-498311882);
        if ((i11 & 14) == 0) {
            if (h11.T(modifier)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onClick)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-498311882, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.BuyerCTAsComponent.WhatsAppButton (BuyerCTAsComponent.kt:39)");
            }
            ButtonData a11 = ButtonData.f40994a.a();
            dk.a aVar3 = dk.a.f54291a;
            int i15 = dk.a.f54292b;
            d h12 = aVar3.a(h11, i15).h();
            int i16 = d.f76453b;
            long i17 = h12.i(h11, i16);
            long j11 = aVar3.a(h11, i15).h().j(h11, i16);
            long k11 = aVar3.a(h11, i15).h().k(h11, i16);
            aVar2 = h11;
            ButtonsKt.d(onClick, modifier, a11, null, t1.g(i17), t1.g(j11), t1.g(k11), false, null, PaddingKt.a(h.l(8)), ComposableSingletons$BuyerCTAsComponentKt.f25515a.b(), h11, ((i12 >> 3) & 14) | 805306368 | ((i12 << 3) & 112) | (ButtonData.f40995b << 6), 6, 392);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerCTAsComponent$WhatsAppButton$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i18) {
                    BuyerCTAsComponent.this.c(modifier, onClick, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
