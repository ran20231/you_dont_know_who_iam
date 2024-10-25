package com.forsale.app.features.categories.listings.items.horizontalListing;

import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.c;
import com.forsale.designSystem.layouts.PlaceHolderKt;
import e2.h;
import g00.p;
import r0.b;
/* compiled from: HorizontalListingsView.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$HorizontalListingsViewKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$HorizontalListingsViewKt f30727a = new ComposableSingletons$HorizontalListingsViewKt();

    /* renamed from: b  reason: collision with root package name */
    public static p<androidx.compose.runtime.a, Integer, wz.p> f30728b = b.c(76750688, false, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.ComposableSingletons$HorizontalListingsViewKt$lambda-1$1
        public final void b(androidx.compose.runtime.a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(76750688, i11, -1, "com.forsale.app.features.categories.listings.items.horizontalListing.ComposableSingletons$HorizontalListingsViewKt.lambda-1.<anonymous> (HorizontalListingsView.kt:125)");
            }
            PlaceHolderKt.a(AspectRatioKt.a(SizeKt.u(androidx.compose.ui.c.f7566a, h.l(159)), 1.0f, false), aVar, 6);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
            b(aVar, num.intValue());
            return wz.p.f75480a;
        }
    });

    public final p<androidx.compose.runtime.a, Integer, wz.p> a() {
        return f30728b;
    }
}
