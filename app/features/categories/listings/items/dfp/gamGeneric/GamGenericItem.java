package com.forsale.app.features.categories.listings.items.dfp.gamGeneric;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.s;
import com.forsale.app.features.categories.listings.items.dfp.GamComposeKt;
import com.forsale.app.features.categories.listings.items.dfp.gamGeneric.a;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import e2.h;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kr.b;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: GamGenericItem.kt */
/* loaded from: classes2.dex */
public final class GamGenericItem extends qc.a<ViewHolder, p, b> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f30661k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f30662l = 8;

    /* renamed from: m  reason: collision with root package name */
    private static final long f30663m = r0.f70132x3;

    /* renamed from: h  reason: collision with root package name */
    private final b f30664h;

    /* renamed from: i  reason: collision with root package name */
    private final s f30665i;

    /* renamed from: j  reason: collision with root package name */
    private final int f30666j;

    /* compiled from: GamGenericItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<GamGenericItem> {

        /* renamed from: b  reason: collision with root package name */
        public static final int f30667b = ComposeView.f8700x;

        /* renamed from: a  reason: collision with root package name */
        private final ComposeView f30668a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ComposeView composeView) {
            super(composeView);
            o.i(composeView, "composeView");
            this.f30668a = composeView;
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.f8788b);
        }

        @Override // kr.b.c
        /* renamed from: f */
        public void b(final GamGenericItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f30668a.setContent(r0.b.c(-1780569158, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.items.dfp.gamGeneric.GamGenericItem$ViewHolder$bindView$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar, int i11) {
                    if ((i11 & 11) == 2 && aVar.i()) {
                        aVar.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-1780569158, i11, -1, "com.forsale.app.features.categories.listings.items.dfp.gamGeneric.GamGenericItem.ViewHolder.bindView.<anonymous> (GamGenericItem.kt:40)");
                    }
                    final GamGenericItem gamGenericItem = GamGenericItem.this;
                    ThemeKt.a(null, null, r0.b.b(aVar, 1489534147, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.items.dfp.gamGeneric.GamGenericItem$ViewHolder$bindView$1.1
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            b bVar;
                            b bVar2;
                            b bVar3;
                            b bVar4;
                            b bVar5;
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(1489534147, i12, -1, "com.forsale.app.features.categories.listings.items.dfp.gamGeneric.GamGenericItem.ViewHolder.bindView.<anonymous>.<anonymous> (GamGenericItem.kt:41)");
                            }
                            bVar = GamGenericItem.this.f30664h;
                            String b11 = bVar.e().b();
                            bVar2 = GamGenericItem.this.f30664h;
                            boolean z11 = false;
                            AdSize[] adSizeArr = {bVar2.e().a()};
                            bVar3 = GamGenericItem.this.f30664h;
                            AdManagerAdRequest f11 = bVar3.f();
                            bVar4 = GamGenericItem.this.f30664h;
                            if (bVar4.e() instanceof a.C0335a) {
                                bVar5 = GamGenericItem.this.f30664h;
                                z11 = ((a.C0335a) bVar5.e()).f();
                            }
                            GamComposeKt.a(b11, adSizeArr, f11, z11, PaddingKt.k(androidx.compose.ui.c.f7566a, 0.0f, h.l(6), 1, null), null, aVar2, 25152, 32);
                            if (c.I()) {
                                c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    }), aVar, 384, 3);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                    b(aVar, num.intValue());
                    return p.f75480a;
                }
            }));
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void e(GamGenericItem item) {
            o.i(item, "item");
            this.f30668a.e();
        }
    }

    /* compiled from: GamGenericItem.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamGenericItem(b viewModel, s lifecycleOwner) {
        super(viewModel, lifecycleOwner);
        o.i(viewModel, "viewModel");
        o.i(lifecycleOwner, "lifecycleOwner");
        this.f30664h = viewModel;
        this.f30665i = lifecycleOwner;
        this.f30666j = t0.f70228i3;
    }

    @Override // pr.a
    public int t() {
        return this.f30666j;
    }

    @Override // pr.a
    /* renamed from: x */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        Context context = v11.getContext();
        o.h(context, "getContext(...)");
        return new ViewHolder(new ComposeView(context, null, 0, 6, null));
    }
}
