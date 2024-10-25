package com.forsale.app.features.postad;

import com.forsale.app.datalayer.database.CategoryDistrict;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import g00.p;
import java.util.List;
import kotlin.collections.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$selectLocations$1", f = "PostAdViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$selectLocations$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34147a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34148b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DistrictEntity f34149c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DistrictEntity f34150d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f34151e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$selectLocations$1$1", f = "PostAdViewModel.kt", l = {750}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.PostAdViewModel$selectLocations$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<ListingDetailsEntity, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34152a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f34153b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34154c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DistrictEntity f34155d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DistrictEntity f34156e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ PostAdViewModel f34157f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z11, DistrictEntity districtEntity, DistrictEntity districtEntity2, PostAdViewModel postAdViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34154c = z11;
            this.f34155d = districtEntity;
            this.f34156e = districtEntity2;
            this.f34157f = postAdViewModel;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(ListingDetailsEntity listingDetailsEntity, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(listingDetailsEntity, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34154c, this.f34155d, this.f34156e, this.f34157f, aVar);
            anonymousClass1.f34153b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            CategoriesRepositories categoriesRepositories;
            ListingDetailsEntity listingDetailsEntity;
            List<DistrictEntity> list;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f34152a;
            if (i11 != 0) {
                if (i11 == 1) {
                    listingDetailsEntity = (ListingDetailsEntity) this.f34153b;
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                ListingDetailsEntity listingDetailsEntity2 = (ListingDetailsEntity) this.f34153b;
                if (this.f34154c) {
                    DistrictEntity districtEntity = this.f34155d;
                    List<Integer> list2 = null;
                    if (districtEntity != null) {
                        list = q.e(districtEntity);
                    } else {
                        list = null;
                    }
                    listingDetailsEntity2.setDistricts(list);
                    DistrictEntity districtEntity2 = this.f34155d;
                    if (districtEntity2 != null) {
                        list2 = q.e(kotlin.coroutines.jvm.internal.a.d(districtEntity2.getId()));
                    }
                    listingDetailsEntity2.setDistrictsIds(list2);
                }
                Integer categoryId = listingDetailsEntity2.getCategoryId();
                if (categoryId != null) {
                    DistrictEntity districtEntity3 = this.f34156e;
                    PostAdViewModel postAdViewModel = this.f34157f;
                    int intValue = categoryId.intValue();
                    if (districtEntity3 != null) {
                        categoriesRepositories = postAdViewModel.f33940k0;
                        int id2 = districtEntity3.getId();
                        this.f34153b = listingDetailsEntity2;
                        this.f34152a = 1;
                        Object categoryDistrictByCategoryId = categoriesRepositories.getCategoryDistrictByCategoryId(intValue, id2, this);
                        if (categoryDistrictByCategoryId == f11) {
                            return f11;
                        }
                        listingDetailsEntity = listingDetailsEntity2;
                        obj = categoryDistrictByCategoryId;
                    }
                }
                return wz.p.f75480a;
            }
            listingDetailsEntity.setCategoryDistrict((CategoryDistrict) obj);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$selectLocations$1(PostAdViewModel postAdViewModel, DistrictEntity districtEntity, DistrictEntity districtEntity2, boolean z11, zz.a<? super PostAdViewModel$selectLocations$1> aVar) {
        super(2, aVar);
        this.f34148b = postAdViewModel;
        this.f34149c = districtEntity;
        this.f34150d = districtEntity2;
        this.f34151e = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$selectLocations$1(this.f34148b, this.f34149c, this.f34150d, this.f34151e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f34147a == 0) {
            kotlin.f.b(obj);
            this.f34148b.e2().postValue(this.f34149c);
            this.f34148b.m2().postValue(this.f34150d);
            PostAdViewModel postAdViewModel = this.f34148b;
            postAdViewModel.M4(new AnonymousClass1(this.f34151e, this.f34150d, this.f34149c, postAdViewModel, null));
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$selectLocations$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
