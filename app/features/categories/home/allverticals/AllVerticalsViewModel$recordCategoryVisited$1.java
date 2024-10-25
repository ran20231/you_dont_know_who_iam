package com.forsale.app.features.categories.home.allverticals;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http.StatusLine;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$recordCategoryVisited$1", f = "AllVerticalsViewModel.kt", l = {StatusLine.HTTP_MISDIRECTED_REQUEST}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel$recordCategoryVisited$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23463a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllVerticalsViewModel f23464b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f23465c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsViewModel$recordCategoryVisited$1(AllVerticalsViewModel allVerticalsViewModel, String str, zz.a<? super AllVerticalsViewModel$recordCategoryVisited$1> aVar) {
        super(2, aVar);
        this.f23464b = allVerticalsViewModel;
        this.f23465c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AllVerticalsViewModel$recordCategoryVisited$1(this.f23464b, this.f23465c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b0 b0Var;
        pa.a aVar;
        String value;
        String a11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23463a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            b0Var = this.f23464b.F;
            RegionEntity regionEntity = (RegionEntity) b0Var.getValue();
            if (regionEntity != null) {
                AllVerticalsViewModel allVerticalsViewModel = this.f23464b;
                String str = this.f23465c;
                aVar = allVerticalsViewModel.f23386e;
                CategoryEntity Q = allVerticalsViewModel.Q();
                CategoryListingsAnalyticSource K = allVerticalsViewModel.K();
                if (K != null && (a11 = K.a()) != null) {
                    value = a11;
                } else {
                    value = allVerticalsViewModel.O().getValue();
                }
                this.f23463a = 1;
                if (aVar.e(Q, value, regionEntity, str, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AllVerticalsViewModel$recordCategoryVisited$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
