package com.forsale.app.features.categories.listings.items.horizontalListing.controllers;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.forsale.app.utils.LocaleManager;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import x10.a;
/* compiled from: CommercialController.kt */
/* loaded from: classes2.dex */
public final class CommercialController implements bd.a, CoroutineScope {

    /* renamed from: d  reason: collision with root package name */
    private static final a f30787d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f30788e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f30789a = CoroutineScopeKt.MainScope();

    /* renamed from: b  reason: collision with root package name */
    private final Mutex f30790b = MutexKt.Mutex$default(false, 1, null);

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.s f30791c = new RecyclerView.s() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.controllers.CommercialController$touchListener$1
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView rv2, MotionEvent e11) {
            o.i(rv2, "rv");
            o.i(e11, "e");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean b(RecyclerView rv2, MotionEvent e11) {
            o.i(rv2, "rv");
            o.i(e11, "e");
            a.b(String.valueOf(e11.getAction()), new Object[0]);
            if (e11.getAction() != 0 && e11.getAction() != 2) {
                CommercialController commercialController = CommercialController.this;
                BuildersKt__Builders_commonKt.launch$default(commercialController, null, null, new CommercialController$touchListener$1$onInterceptTouchEvent$2(commercialController, null), 3, null);
            } else {
                CommercialController commercialController2 = CommercialController.this;
                BuildersKt__Builders_commonKt.launch$default(commercialController2, null, null, new CommercialController$touchListener$1$onInterceptTouchEvent$1(commercialController2, null), 3, null);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void c(boolean z11) {
        }
    };

    /* compiled from: CommercialController.kt */
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CommercialController.kt */
    /* loaded from: classes2.dex */
    public static final class b extends m {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.m
        protected int getHorizontalSnapPreference() {
            return -1;
        }
    }

    private final boolean e(RecyclerView recyclerView) {
        if (recyclerView.canScrollHorizontally(1) || recyclerView.canScrollHorizontally(-1)) {
            return true;
        }
        return false;
    }

    private final boolean f(RecyclerView recyclerView) {
        int i11;
        if (LocaleManager.f39597a.r()) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        return !recyclerView.canScrollHorizontally(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(RecyclerView recyclerView, GridLayoutManager gridLayoutManager) {
        int x02 = gridLayoutManager.x0();
        gridLayoutManager.t3();
        if (x02 == 0 || x02 == 1 || !e(recyclerView)) {
            return;
        }
        if (f(recyclerView)) {
            recyclerView.C1(0);
            return;
        }
        b bVar = new b(recyclerView.getContext());
        bVar.setTargetPosition(gridLayoutManager.x2() + 1);
        gridLayoutManager.g2(bVar);
    }

    @Override // bd.a
    public void a(RecyclerView rv2) {
        o.i(rv2, "rv");
        RecyclerView.o layoutManager = rv2.getLayoutManager();
        if (layoutManager == null || !(layoutManager instanceof GridLayoutManager)) {
            return;
        }
        rv2.m(this.f30791c);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CommercialController$onBind$1(this, rv2, layoutManager, null), 3, null);
    }

    @Override // bd.a
    public void b(RecyclerView rv2) {
        o.i(rv2, "rv");
        rv2.j1(this.f30791c);
        JobKt__JobKt.cancelChildren$default(getCoroutineContext(), null, 1, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f30789a.getCoroutineContext();
    }
}
