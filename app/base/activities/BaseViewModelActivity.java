package com.forsale.app.base.activities;

import android.os.Bundle;
import androidx.appcompat.app.c;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.c0;
import androidx.lifecycle.t;
import androidx.navigation.NavDestination;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.postad.PLFActivity;
import com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.popUpsPrioritizer.PopUpType;
import com.forsale.app.utils.r0;
import com.forsale.app.utils.s0;
import ij.a;
import kotlin.Pair;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import qm.e;
import t9.y0;
import wz.h;
import wz.p;
/* compiled from: BaseViewModelActivity.kt */
/* loaded from: classes2.dex */
public abstract class BaseViewModelActivity<B extends ViewDataBinding, VM extends BaseViewModel> extends BasePlainActivity<B> {

    /* renamed from: d  reason: collision with root package name */
    private final h f22066d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModelActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c0<Pair<? extends Integer, ? extends Pair<? extends g00.a<? extends p>, ? extends g00.a<? extends p>>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseViewModelActivity<B, VM> f22067a;

        /* JADX WARN: Multi-variable type inference failed */
        a(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity) {
            this.f22067a = baseViewModelActivity;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Pair<Integer, ? extends Pair<? extends g00.a<p>, ? extends g00.a<p>>> pair) {
            BaseViewModelActivity<B, VM> baseViewModelActivity = this.f22067a;
            String string = baseViewModelActivity.getString(pair.c().intValue());
            o.h(string, "getString(...)");
            g00.a<p> c11 = pair.d().c();
            g00.a<p> d11 = pair.d().d();
            int i11 = y0.Z4;
            int i12 = y0.I4;
            if (ContextExtensionsKt.f(baseViewModelActivity)) {
                c.a aVar = new c.a(baseViewModelActivity);
                aVar.p("");
                aVar.h(string);
                aVar.m(baseViewModelActivity.getString(i11), new r0(c11));
                aVar.j(baseViewModelActivity.getString(i12), new s0(d11));
                aVar.d(false);
                aVar.q();
            }
        }
    }

    public BaseViewModelActivity() {
        h a11;
        a11 = d.a(new g00.a<ij.a>(this) { // from class: com.forsale.app.base.activities.BaseViewModelActivity$inAppMessagesCapsule$2

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BaseViewModelActivity<B, VM> f22068a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f22068a = this;
            }

            @Override // g00.a
            /* renamed from: b */
            public final a invoke() {
                return new a(PopUpType.IN_APP_MESSAGING, this.f22068a.x0().d0(), this.f22068a.x0().E());
            }
        });
        this.f22066d = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int v0() {
        return (int) getResources().getDimension(e.f66568d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ij.a w0() {
        return (ij.a) this.f22066d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(InAppMessageEntity inAppMessageEntity) {
        x0().m0(inAppMessageEntity);
        String universalLink = inAppMessageEntity.getUniversalLink();
        if (universalLink != null) {
            FCMTopLevelFunctionsKt.b(this, universalLink);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            x0().s0(bundle);
        }
        LifeCycleUtilsKt.a(this, new BaseViewModelActivity$onCreate$2(this, null));
        LifeCycleUtilsKt.a(this, new BaseViewModelActivity$onCreate$3(this, null));
        LifeCycleUtilsKt.a(this, new BaseViewModelActivity$onCreate$4(this, null));
        LifeCycleUtilsKt.a(this, new BaseViewModelActivity$onCreate$5(this, null));
        LifeCycleUtilsKt.a(this, new BaseViewModelActivity$onCreate$6(this, null));
        LifeCycleUtilsKt.a(this, new BaseViewModelActivity$onCreate$7(this, null));
        LifeCycleUtilsKt.a(this, new BaseViewModelActivity$onCreate$8(this, null));
        x0().C().observe(this, new a(this));
        LifeCycleUtilsKt.a(this, new BaseViewModelActivity$onCreate$10(this, null));
        LifeCycleUtilsKt.a(this, new BaseViewModelActivity$onCreate$11(this, null));
        LifeCycleUtilsKt.a(this, new BaseViewModelActivity$onCreate$12(this, null));
        o0().X(90, x0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new BaseViewModelActivity$onDestroy$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.p, android.app.Activity
    public void onPause() {
        super.onPause();
        x0().Y().resetReplayCache();
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new BaseViewModelActivity$onPause$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.p, android.app.Activity
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new BaseViewModelActivity$onResume$1(this, null), 3, null);
        if (u0()) {
            BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new BaseViewModelActivity$onResume$2(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        o.i(outState, "outState");
        super.onSaveInstanceState(outState);
        Bundle u02 = x0().u0();
        if (u02 != null) {
            outState.putAll(u02);
        }
    }

    public final boolean u0() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this instanceof MainContainerActivity) {
            MainContainerActivity mainContainerActivity = (MainContainerActivity) this;
            NavDestination F = mainContainerActivity.q1().F();
            if (F != null && F.q() == t9.r0.N5) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                NavDestination F2 = mainContainerActivity.q1().F();
                if (F2 != null && F2.q() == t9.r0.P5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    NavDestination F3 = mainContainerActivity.q1().F();
                    if (F3 != null && F3.q() == t9.r0.N0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        NavDestination F4 = mainContainerActivity.q1().F();
                        if (F4 != null && F4.q() == t9.r0.C3) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            return true;
                        }
                    }
                }
            }
        } else if (!(this instanceof WebActivity) && !(this instanceof PLFActivity)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract BaseViewModel x0();
}
