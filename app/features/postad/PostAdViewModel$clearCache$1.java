package com.forsale.app.features.postad;

import com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$clearCache$1", f = "PostAdViewModel.kt", l = {1369}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$clearCache$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34018a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34019b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$clearCache$1(PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$clearCache$1> aVar) {
        super(2, aVar);
        this.f34019b = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$clearCache$1(this.f34019b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingDetailsEntityRepository listingDetailsEntityRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34018a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            this.f34019b.p2().postValue(null);
            listingDetailsEntityRepository = this.f34019b.f33961r0;
            this.f34018a = 1;
            if (listingDetailsEntityRepository.deleteSuspended(this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$clearCache$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
