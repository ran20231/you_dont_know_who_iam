package com.forsale.app.ui.bottomsheets.wanteditems;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.CategoryDao;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddWantedItemViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemViewModel$observer$1$onChanged$1", f = "AddWantedItemViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AddWantedItemViewModel$observer$1$onChanged$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39254a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f39255b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AddWantedItemViewModel f39256c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddWantedItemViewModel$observer$1$onChanged$1(CategoryEntity categoryEntity, AddWantedItemViewModel addWantedItemViewModel, zz.a<? super AddWantedItemViewModel$observer$1$onChanged$1> aVar) {
        super(2, aVar);
        this.f39255b = categoryEntity;
        this.f39256c = addWantedItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AddWantedItemViewModel$observer$1$onChanged$1(this.f39255b, this.f39256c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoryDao categoryDao;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39254a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            if (this.f39255b != null) {
                categoryDao = this.f39256c.f39230m0;
                int parentId = this.f39255b.getParentId();
                this.f39254a = 1;
                obj = categoryDao.getCategorySuspendById(parentId, this);
                if (obj == f11) {
                    return f11;
                }
            } else {
                this.f39256c.C0().postValue(null);
                return wz.p.f75480a;
            }
        }
        b0<String> C0 = this.f39256c.C0();
        String name = ((CategoryEntity) obj).getName();
        String name2 = this.f39255b.getName();
        C0.postValue(name + " - " + name2);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AddWantedItemViewModel$observer$1$onChanged$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
