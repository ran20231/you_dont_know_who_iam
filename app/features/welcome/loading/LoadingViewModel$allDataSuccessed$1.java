package com.forsale.app.features.welcome.loading;

import com.forsale.app.features.welcome.loading.LoadingViewModel;
import g00.r;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$allDataSuccessed$1", f = "LoadingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingViewModel$allDataSuccessed$1 extends SuspendLambda implements r<LoadingViewModel.b, LoadingViewModel.b, LoadingViewModel.b, zz.a<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37226a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37227b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f37228c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f37229d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37230e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$allDataSuccessed$1(LoadingViewModel loadingViewModel, zz.a<? super LoadingViewModel$allDataSuccessed$1> aVar) {
        super(4, aVar);
        this.f37230e = loadingViewModel;
    }

    @Override // g00.r
    /* renamed from: b */
    public final Object d(LoadingViewModel.b bVar, LoadingViewModel.b bVar2, LoadingViewModel.b bVar3, zz.a<? super Boolean> aVar) {
        LoadingViewModel$allDataSuccessed$1 loadingViewModel$allDataSuccessed$1 = new LoadingViewModel$allDataSuccessed$1(this.f37230e, aVar);
        loadingViewModel$allDataSuccessed$1.f37227b = bVar;
        loadingViewModel$allDataSuccessed$1.f37228c = bVar2;
        loadingViewModel$allDataSuccessed$1.f37229d = bVar3;
        return loadingViewModel$allDataSuccessed$1.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List q11;
        boolean z11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f37226a == 0) {
            kotlin.f.b(obj);
            boolean z12 = false;
            q11 = kotlin.collections.r.q((LoadingViewModel.b) this.f37227b, (LoadingViewModel.b) this.f37228c, (LoadingViewModel.b) this.f37229d);
            List<LoadingViewModel.b> list = q11;
            boolean z13 = list instanceof Collection;
            if (!z13 || !list.isEmpty()) {
                for (LoadingViewModel.b bVar : list) {
                    if (!(bVar instanceof LoadingViewModel.b.e)) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (z11) {
                this.f37230e.Y();
            }
            if (!z13 || !list.isEmpty()) {
                for (LoadingViewModel.b bVar2 : list) {
                    if (!(bVar2 instanceof LoadingViewModel.b.e)) {
                        break;
                    }
                }
            }
            z12 = true;
            return kotlin.coroutines.jvm.internal.a.a(z12);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
