package com.forsale.app.features.categories.home.allverticals;

import com.forsale.app.datalayer.database.CategoryEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchNotBusinessCategories$2", f = "AllVerticalsViewModel.kt", l = {214}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel$fetchNotBusinessCategories$2 extends SuspendLambda implements g00.l<zz.a<? super List<? extends CategoryEntity>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23449a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllVerticalsViewModel f23450b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsViewModel$fetchNotBusinessCategories$2(AllVerticalsViewModel allVerticalsViewModel, zz.a<? super AllVerticalsViewModel$fetchNotBusinessCategories$2> aVar) {
        super(1, aVar);
        this.f23450b = allVerticalsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new AllVerticalsViewModel$fetchNotBusinessCategories$2(this.f23450b, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(zz.a<? super List<? extends CategoryEntity>> aVar) {
        return invoke2((zz.a<? super List<CategoryEntity>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ca.c cVar;
        List q11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23449a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            cVar = this.f23450b.f23382a;
            int id2 = this.f23450b.Q().getId();
            this.f23449a = 1;
            obj = cVar.a(id2, this);
            if (obj == f11) {
                return f11;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            q11 = r.q(CategoryEntity.Classification.BUSINESS, CategoryEntity.Classification.FOR_SALE, CategoryEntity.Classification.PREMIUM);
            if (!q11.contains(((CategoryEntity) obj2).getClassification())) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(zz.a<? super List<CategoryEntity>> aVar) {
        return ((AllVerticalsViewModel$fetchNotBusinessCategories$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
