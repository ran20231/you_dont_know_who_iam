package com.forsale.app.features.categories.listings.items.horizontalListing;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.s;
import com.forsale.designSystem.theme.ThemeKt;
import g00.p;
import java.util.List;
import kotlin.jvm.internal.o;
import kr.b;
import qc.b;
import t9.t0;
/* compiled from: HorizontalListingsComposeItem.kt */
/* loaded from: classes2.dex */
public final class HorizontalListingsComposeItem extends qc.a<ViewHolder, List<? extends b<?>>, HorizontalListingsItemViewModel> {

    /* renamed from: h  reason: collision with root package name */
    private final HorizontalListingsItemViewModel f30730h;

    /* renamed from: i  reason: collision with root package name */
    private final int f30731i;

    /* compiled from: HorizontalListingsComposeItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<HorizontalListingsComposeItem> {

        /* renamed from: b  reason: collision with root package name */
        public static final int f30732b = ComposeView.f8700x;

        /* renamed from: a  reason: collision with root package name */
        private final ComposeView f30733a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ComposeView composeView) {
            super(composeView);
            o.i(composeView, "composeView");
            this.f30733a = composeView;
        }

        @Override // kr.b.c
        /* renamed from: f */
        public void b(final HorizontalListingsComposeItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f30733a.setContent(r0.b.c(-1456184679, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsComposeItem$ViewHolder$bindView$1
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
                        c.U(-1456184679, i11, -1, "com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsComposeItem.ViewHolder.bindView.<anonymous> (HorizontalListingsComposeItem.kt:39)");
                    }
                    final HorizontalListingsComposeItem horizontalListingsComposeItem = HorizontalListingsComposeItem.this;
                    ThemeKt.a(null, null, r0.b.b(aVar, -391209566, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsComposeItem$ViewHolder$bindView$1.1
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(-391209566, i12, -1, "com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsComposeItem.ViewHolder.bindView.<anonymous>.<anonymous> (HorizontalListingsComposeItem.kt:40)");
                            }
                            HorizontalListingsViewKt.a(HorizontalListingsComposeItem.this.v(), aVar2, 8);
                            if (c.I()) {
                                c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    }), aVar, 384, 3);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                    b(aVar, num.intValue());
                    return wz.p.f75480a;
                }
            }));
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void e(HorizontalListingsComposeItem item) {
            o.i(item, "item");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalListingsComposeItem(HorizontalListingsItemViewModel viewModel, s lifeCycleOwner) {
        super(viewModel, lifeCycleOwner);
        o.i(viewModel, "viewModel");
        o.i(lifeCycleOwner, "lifeCycleOwner");
        this.f30730h = viewModel;
        this.f30731i = t0.f70228i3;
    }

    @Override // pr.a
    public int t() {
        return this.f30731i;
    }

    @Override // pr.a
    /* renamed from: w */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        Context context = v11.getContext();
        o.h(context, "getContext(...)");
        return new ViewHolder(new ComposeView(context, null, 0, 6, null));
    }
}
