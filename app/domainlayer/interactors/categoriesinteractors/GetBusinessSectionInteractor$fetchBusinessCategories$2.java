package com.forsale.app.domainlayer.interactors.categoriesinteractors;

import ca.b;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel;
import g00.l;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetBusinessSectionInteractor.kt */
@d(c = "com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessSectionInteractor$fetchBusinessCategories$2", f = "GetBusinessSectionInteractor.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GetBusinessSectionInteractor$fetchBusinessCategories$2 extends SuspendLambda implements l<zz.a<? super AllVerticalsViewModel.e>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f22396a;

    /* renamed from: b  reason: collision with root package name */
    int f22397b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ GetBusinessSectionInteractor f22398c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f22399d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBusinessSectionInteractor$fetchBusinessCategories$2(GetBusinessSectionInteractor getBusinessSectionInteractor, int i11, zz.a<? super GetBusinessSectionInteractor$fetchBusinessCategories$2> aVar) {
        super(1, aVar);
        this.f22398c = getBusinessSectionInteractor;
        this.f22399d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new GetBusinessSectionInteractor$fetchBusinessCategories$2(this.f22398c, this.f22399d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b bVar;
        List<? extends CategoryEntity.Classification> q11;
        GetBusinessSectionInteractor getBusinessSectionInteractor;
        AllVerticalsViewModel.e e11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22397b;
        if (i11 != 0) {
            if (i11 == 1) {
                getBusinessSectionInteractor = (GetBusinessSectionInteractor) this.f22396a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            GetBusinessSectionInteractor getBusinessSectionInteractor2 = this.f22398c;
            bVar = getBusinessSectionInteractor2.f22392a;
            int i12 = this.f22399d;
            q11 = r.q(CategoryEntity.Classification.BUSINESS, CategoryEntity.Classification.FOR_SALE);
            this.f22396a = getBusinessSectionInteractor2;
            this.f22397b = 1;
            Object a11 = bVar.a(i12, q11, this);
            if (a11 == f11) {
                return f11;
            }
            getBusinessSectionInteractor = getBusinessSectionInteractor2;
            obj = a11;
        }
        e11 = getBusinessSectionInteractor.e((List) obj);
        return e11;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super AllVerticalsViewModel.e> aVar) {
        return ((GetBusinessSectionInteractor$fetchBusinessCategories$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
