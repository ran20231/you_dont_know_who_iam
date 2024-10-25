package com.forsale.app.ui.bottomsheets.useractions;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import t9.y0;
/* compiled from: ReportAbuseBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.useractions.ReportAbuseBottomSheet$onCreateView$1$2", f = "ReportAbuseBottomSheet.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ReportAbuseBottomSheet$onCreateView$1$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39175a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ReportAbuseBottomSheet f39176b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAbuseBottomSheet$onCreateView$1$2(ReportAbuseBottomSheet reportAbuseBottomSheet, zz.a<? super ReportAbuseBottomSheet$onCreateView$1$2> aVar) {
        super(2, aVar);
        this.f39176b = reportAbuseBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ReportAbuseBottomSheet$onCreateView$1$2(this.f39176b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ReportAbuseViewModel G;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39175a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            G = this.f39176b.G();
            OneShotEventHandler<String> E0 = G.E0();
            a aVar = new a(this.f39176b);
            this.f39175a = 1;
            if (E0.e(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ReportAbuseBottomSheet$onCreateView$1$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReportAbuseBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a implements FlowCollector<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReportAbuseBottomSheet f39177a;

        a(ReportAbuseBottomSheet reportAbuseBottomSheet) {
            this.f39177a = reportAbuseBottomSheet;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(String str, zz.a<? super wz.p> aVar) {
            if (str != null) {
                this.f39177a.dismiss();
                Context context = this.f39177a.getContext();
                if (context != null && ContextExtensionsKt.f(context)) {
                    c.a aVar2 = new c.a(context);
                    aVar2.o(y0.R4);
                    aVar2.h(str);
                    aVar2.m(context.getString(y0.Z4), new DialogInterface$OnClickListenerC0440a());
                    aVar2.d(false);
                    aVar2.q();
                }
            }
            return wz.p.f75480a;
        }

        /* compiled from: ViewsExtensions.kt */
        /* renamed from: com.forsale.app.ui.bottomsheets.useractions.ReportAbuseBottomSheet$onCreateView$1$2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class DialogInterface$OnClickListenerC0440a implements DialogInterface.OnClickListener {
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
            }
        }
    }
}
