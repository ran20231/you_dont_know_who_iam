package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import aa.m4;
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
import t9.r0;
import t9.t0;
import t9.y0;
import wz.p;
/* compiled from: CallUserItem.kt */
/* loaded from: classes3.dex */
public final class CallUserItem extends pr.a<CallUserViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final ActionUserItemViewModel f38345f;

    /* renamed from: g  reason: collision with root package name */
    private final s f38346g;

    /* renamed from: h  reason: collision with root package name */
    private final int f38347h;

    /* renamed from: i  reason: collision with root package name */
    private final int f38348i;

    /* compiled from: CallUserItem.kt */
    /* loaded from: classes3.dex */
    public static final class CallUserViewHolder extends b.c<CallUserItem> {

        /* renamed from: a  reason: collision with root package name */
        private final m4 f38349a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CallUserItem.kt */
        /* loaded from: classes3.dex */
        public static final class a implements FlowCollector<String> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ m4 f38351b;

            a(m4 m4Var) {
                this.f38351b = m4Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(String str, zz.a<? super p> aVar) {
                if (str != null) {
                    CallUserViewHolder callUserViewHolder = CallUserViewHolder.this;
                    Context context = this.f38351b.getRoot().getContext();
                    o.h(context, "getContext(...)");
                    callUserViewHolder.h(context, str);
                }
                return p.f75480a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public CallUserViewHolder(aa.m4 r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f38349a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.CallUserItem.CallUserViewHolder.<init>(aa.m4):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(final Context context, String str) {
            ContextExtensionKt.a(context, str, new l<Exception, p>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.CallUserItem$CallUserViewHolder$openCallIntent$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(Exception it2) {
                    o.i(it2, "it");
                    Context context2 = context;
                    if (context2 != null) {
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
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Exception exc) {
                    b(exc);
                    return p.f75480a;
                }

                /* compiled from: ViewsExtensions.kt */
                /* loaded from: classes3.dex */
                public static final class a implements DialogInterface.OnClickListener {
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                    }
                }
            });
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(CallUserItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            m4 m4Var = this.f38349a;
            m4Var.U(item.v());
            m4Var.h0(item.x());
            item.x().p().h(item.v(), new a(m4Var));
        }

        @Override // kr.b.c
        /* renamed from: i */
        public void e(CallUserItem item) {
            o.i(item, "item");
        }
    }

    public CallUserItem(ActionUserItemViewModel viewModel, s lifeCycle) {
        o.i(viewModel, "viewModel");
        o.i(lifeCycle, "lifeCycle");
        this.f38345f = viewModel;
        this.f38346g = lifeCycle;
        this.f38347h = t0.f70337y0;
        this.f38348i = r0.J1;
    }

    @Override // kr.m
    public int getType() {
        return this.f38348i;
    }

    @Override // pr.a
    public int t() {
        return this.f38347h;
    }

    public final s v() {
        return this.f38346g;
    }

    @Override // pr.a
    /* renamed from: w */
    public CallUserViewHolder u(View v11) {
        o.i(v11, "v");
        m4 f02 = m4.f0(v11);
        o.h(f02, "bind(...)");
        return new CallUserViewHolder(f02);
    }

    public final ActionUserItemViewModel x() {
        return this.f38345f;
    }
}
