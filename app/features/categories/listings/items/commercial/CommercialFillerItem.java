package com.forsale.app.features.categories.listings.items.commercial;

import aa.od;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.lifecycle.s;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.core.util.ContextExtensionKt;
import g00.l;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import qc.a;
import t9.t0;
import t9.y0;
import wz.p;
/* compiled from: CommercialFillerItem.kt */
/* loaded from: classes2.dex */
public final class CommercialFillerItem extends a<ViewHolder, p, CommercialFillerViewModel> {

    /* renamed from: h  reason: collision with root package name */
    private final CommercialFillerViewModel f30584h;

    /* renamed from: i  reason: collision with root package name */
    private final s f30585i;

    /* renamed from: j  reason: collision with root package name */
    private final int f30586j;

    /* compiled from: CommercialFillerItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<CommercialFillerItem> {

        /* renamed from: a  reason: collision with root package name */
        private final od f30587a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CommercialFillerItem.kt */
        /* loaded from: classes2.dex */
        public static final class a implements FlowCollector<String> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ od f30589b;

            a(od odVar) {
                this.f30589b = odVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(String str, zz.a<? super p> aVar) {
                if (str != null) {
                    ViewHolder viewHolder = ViewHolder.this;
                    Context context = this.f30589b.getRoot().getContext();
                    o.h(context, "getContext(...)");
                    viewHolder.h(context, str);
                }
                return p.f75480a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.od r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f30587a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.commercial.CommercialFillerItem.ViewHolder.<init>(aa.od):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(final Context context, String str) {
            ContextExtensionKt.a(context, str, new l<Exception, p>() { // from class: com.forsale.app.features.categories.listings.items.commercial.CommercialFillerItem$ViewHolder$openCallIntent$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(Exception it2) {
                    o.i(it2, "it");
                    Context context2 = context;
                    String string = context2.getString(y0.Z9);
                    o.h(string, "getString(...)");
                    if (ContextExtensionsKt.f(context2)) {
                        c.a aVar = new c.a(context2);
                        aVar.o(y0.M4);
                        aVar.h(string);
                        aVar.m(context2.getString(y0.Z4), new a());
                        aVar.d(false);
                        aVar.q();
                    }
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Exception exc) {
                    b(exc);
                    return p.f75480a;
                }

                /* compiled from: ViewsExtensions.kt */
                /* loaded from: classes2.dex */
                public static final class a implements DialogInterface.OnClickListener {
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                    }
                }
            });
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(CommercialFillerItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            od odVar = this.f30587a;
            odVar.i0(item.f30584h);
            odVar.U(item.f30585i);
            CommercialFillerViewModel h02 = odVar.h0();
            if (h02 != null) {
                h02.e().h(item.f30585i, new a(odVar));
            }
            odVar.u();
        }

        @Override // kr.b.c
        /* renamed from: i */
        public void e(CommercialFillerItem item) {
            o.i(item, "item");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialFillerItem(CommercialFillerViewModel viewModel, s lifecycleOwner) {
        super(viewModel, lifecycleOwner);
        o.i(viewModel, "viewModel");
        o.i(lifecycleOwner, "lifecycleOwner");
        this.f30584h = viewModel;
        this.f30585i = lifecycleOwner;
        this.f30586j = t0.Y2;
    }

    @Override // pr.a
    public int t() {
        return this.f30586j;
    }

    @Override // pr.a
    /* renamed from: y */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        od f02 = od.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02);
    }
}
