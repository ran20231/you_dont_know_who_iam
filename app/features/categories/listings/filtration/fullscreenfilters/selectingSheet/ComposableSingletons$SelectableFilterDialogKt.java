package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet;

import androidx.compose.runtime.c;
import com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt;
import g00.q;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: SelectableFilterDialog.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$SelectableFilterDialogKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$SelectableFilterDialogKt f29948a = new ComposableSingletons$SelectableFilterDialogKt();

    /* renamed from: b  reason: collision with root package name */
    public static q<x.a, androidx.compose.runtime.a, Integer, p> f29949b = r0.b.c(416302745, false, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.ComposableSingletons$SelectableFilterDialogKt$lambda-1$1
        public final void b(x.a item, androidx.compose.runtime.a aVar, int i11) {
            int i12;
            o.i(item, "$this$item");
            if ((i11 & 14) == 0) {
                if (aVar.T(item)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 |= i12;
            }
            if ((i11 & 91) == 18 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(416302745, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.ComposableSingletons$SelectableFilterDialogKt.lambda-1.<anonymous> (SelectableFilterDialog.kt:182)");
            }
            CommonViewsKt.c(item, aVar, i11 & 14);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ p invoke(x.a aVar, androidx.compose.runtime.a aVar2, Integer num) {
            b(aVar, aVar2, num.intValue());
            return p.f75480a;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public static q<x.a, androidx.compose.runtime.a, Integer, p> f29950c = r0.b.c(-457194776, false, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.ComposableSingletons$SelectableFilterDialogKt$lambda-2$1
        public final void b(x.a item, androidx.compose.runtime.a aVar, int i11) {
            int i12;
            o.i(item, "$this$item");
            if ((i11 & 14) == 0) {
                if (aVar.T(item)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 |= i12;
            }
            if ((i11 & 91) == 18 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(-457194776, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.ComposableSingletons$SelectableFilterDialogKt.lambda-2.<anonymous> (SelectableFilterDialog.kt:212)");
            }
            CommonViewsKt.c(item, aVar, i11 & 14);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ p invoke(x.a aVar, androidx.compose.runtime.a aVar2, Integer num) {
            b(aVar, aVar2, num.intValue());
            return p.f75480a;
        }
    });

    public final q<x.a, androidx.compose.runtime.a, Integer, p> a() {
        return f29949b;
    }

    public final q<x.a, androidx.compose.runtime.a, Integer, p> b() {
        return f29950c;
    }
}
