package com.forsale.app.ui.bottomsheets.useractions;

import aa.in;
import androidx.databinding.ObservableField;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.google.android.material.button.MaterialButton;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: ReportAbuseBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.useractions.ReportAbuseBottomSheet$onCreateView$1$1", f = "ReportAbuseBottomSheet.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ReportAbuseBottomSheet$onCreateView$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39172a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ReportAbuseBottomSheet f39173b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReportAbuseBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a implements FlowCollector<wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReportAbuseBottomSheet f39174a;

        a(ReportAbuseBottomSheet reportAbuseBottomSheet) {
            this.f39174a = reportAbuseBottomSheet;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            ReportAbuseViewModel G;
            in inVar;
            ReportAbuseViewModel G2;
            G = this.f39174a.G();
            ObservableField<String> z02 = G.z0();
            if (z02 != null) {
                ReportAbuseBottomSheet reportAbuseBottomSheet = this.f39174a;
                inVar = reportAbuseBottomSheet.f39167y;
                if (inVar == null) {
                    o.w("binding");
                    inVar = null;
                }
                MaterialButton btnReportAbuse = inVar.P;
                o.h(btnReportAbuse, "btnReportAbuse");
                ViewsExtensionsKt.n(btnReportAbuse, 5);
                G2 = reportAbuseBottomSheet.G();
                G2.N0(String.valueOf(z02.j()));
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAbuseBottomSheet$onCreateView$1$1(ReportAbuseBottomSheet reportAbuseBottomSheet, zz.a<? super ReportAbuseBottomSheet$onCreateView$1$1> aVar) {
        super(2, aVar);
        this.f39173b = reportAbuseBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ReportAbuseBottomSheet$onCreateView$1$1(this.f39173b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ReportAbuseViewModel G;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39172a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            G = this.f39173b.G();
            OneShotEventHandler<wz.p> D0 = G.D0();
            a aVar = new a(this.f39173b);
            this.f39172a = 1;
            if (D0.e(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ReportAbuseBottomSheet$onCreateView$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
