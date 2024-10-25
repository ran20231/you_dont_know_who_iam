package com.forsale.app.features.categories.home.maincategories;

import com.forsale.app.features.categories.home.ContinueBrowsingRepository;
import com.leanplum.internal.ResourceQualifiers;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import oa.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$loadContinueBrowsingData$1", f = "MainCategoriesViewModel.kt", l = {191, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainCategoriesViewModel$loadContinueBrowsingData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24397a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainCategoriesViewModel f24398b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCategoriesViewModel$loadContinueBrowsingData$1(MainCategoriesViewModel mainCategoriesViewModel, zz.a<? super MainCategoriesViewModel$loadContinueBrowsingData$1> aVar) {
        super(2, aVar);
        this.f24398b = mainCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainCategoriesViewModel$loadContinueBrowsingData$1(this.f24398b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ContinueBrowsingRepository continueBrowsingRepository;
        MutableStateFlow mutableStateFlow;
        f11 = b.f();
        int i11 = this.f24397a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            continueBrowsingRepository = this.f24398b.f24373o0;
            this.f24397a = 1;
            obj = continueBrowsingRepository.d(this);
            if (obj == f11) {
                return f11;
            }
        }
        g gVar = (g) obj;
        if (gVar != null) {
            mutableStateFlow = this.f24398b.E0;
            this.f24397a = 2;
            if (mutableStateFlow.emit(gVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainCategoriesViewModel$loadContinueBrowsingData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
