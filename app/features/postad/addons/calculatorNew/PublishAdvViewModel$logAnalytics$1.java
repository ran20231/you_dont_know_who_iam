package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import com.forsale.app.utils.analytics.logger.AnalyticLoggerType;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import wi.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$logAnalytics$1", f = "PublishAdvViewModel.kt", l = {211, 207}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PublishAdvViewModel$logAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    final /* synthetic */ boolean A;

    /* renamed from: a  reason: collision with root package name */
    Object f34641a;

    /* renamed from: b  reason: collision with root package name */
    Object f34642b;

    /* renamed from: c  reason: collision with root package name */
    Object f34643c;

    /* renamed from: d  reason: collision with root package name */
    Object f34644d;

    /* renamed from: e  reason: collision with root package name */
    Object f34645e;

    /* renamed from: f  reason: collision with root package name */
    Object f34646f;

    /* renamed from: g  reason: collision with root package name */
    Object f34647g;

    /* renamed from: h  reason: collision with root package name */
    Object f34648h;

    /* renamed from: i  reason: collision with root package name */
    boolean f34649i;

    /* renamed from: j  reason: collision with root package name */
    int f34650j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ PublishAdvViewModel f34651x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ CreateEditAdvActionType f34652y;

    /* renamed from: z  reason: collision with root package name */
    final /* synthetic */ String f34653z;

    /* compiled from: PublishAdvViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34654a;

        static {
            int[] iArr = new int[CreateEditAdvActionType.values().length];
            try {
                iArr[CreateEditAdvActionType.UPLOAD_NEW_PAID_LISTING_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateEditAdvActionType.EDIT_PAID_LISTING_STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CreateEditAdvActionType.UPLOAD_NEW_FREE_LISTING_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CreateEditAdvActionType.EDIT_FREE_LISTING_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f34654a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$logAnalytics$1(PublishAdvViewModel publishAdvViewModel, CreateEditAdvActionType createEditAdvActionType, String str, boolean z11, zz.a<? super PublishAdvViewModel$logAnalytics$1> aVar) {
        super(2, aVar);
        this.f34651x = publishAdvViewModel;
        this.f34652y = createEditAdvActionType;
        this.f34653z = str;
        this.A = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PublishAdvViewModel$logAnalytics$1(this.f34651x, this.f34652y, this.f34653z, this.A, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel postAdViewModel;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        PostAdViewModel postAdViewModel2;
        PostAdViewModel postAdViewModel3;
        Object x32;
        ListingDetailsEntity listingDetailsEntity;
        PublishAdvViewModel publishAdvViewModel;
        CreateEditAdvActionType createEditAdvActionType;
        CreateEditAdvActionType createEditAdvActionType2;
        boolean z11;
        ListingDetailsEntity listingDetailsEntity2;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger2;
        String str;
        UserEntity userEntity;
        int i11;
        CreateEditAdvActionType createEditAdvActionType3;
        PublishAdvViewModel publishAdvViewModel2;
        ListingDetailsEntity listingDetailsEntity3;
        int i12;
        PostAdViewModel postAdViewModel4;
        f11 = b.f();
        int i13 = this.f34650j;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    listingDetailsEntity3 = (ListingDetailsEntity) this.f34643c;
                    createEditAdvActionType3 = (CreateEditAdvActionType) this.f34642b;
                    publishAdvViewModel2 = (PublishAdvViewModel) this.f34641a;
                    f.b(obj);
                    i11 = 1;
                    c cVar = new c(createEditAdvActionType3, AnalyticLoggerType.Firebase);
                    i12 = a.f34654a[createEditAdvActionType3.ordinal()];
                    if (i12 != i11 || i12 == 2 || i12 == 3 || i12 == 4) {
                        postAdViewModel4 = publishAdvViewModel2.f34595a;
                        publishAdvViewModel2.c0(cVar, postAdViewModel4.a3().getValue(), listingDetailsEntity3);
                        return wz.p.f75480a;
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z12 = this.f34649i;
            f.b(obj);
            z11 = z12;
            aggregatedAllAnalyticsLogger2 = (AggregatedAllAnalyticsLogger) this.f34648h;
            createEditAdvActionType = (CreateEditAdvActionType) this.f34647g;
            listingDetailsEntity2 = (ListingDetailsEntity) this.f34646f;
            userEntity = (UserEntity) this.f34645e;
            listingDetailsEntity = (ListingDetailsEntity) this.f34644d;
            str = (String) this.f34643c;
            createEditAdvActionType2 = (CreateEditAdvActionType) this.f34642b;
            publishAdvViewModel = (PublishAdvViewModel) this.f34641a;
            x32 = obj;
        } else {
            f.b(obj);
            postAdViewModel = this.f34651x.f34595a;
            ListingDetailsEntity n22 = postAdViewModel.n2();
            if (n22 != null) {
                PublishAdvViewModel publishAdvViewModel3 = this.f34651x;
                CreateEditAdvActionType createEditAdvActionType4 = this.f34652y;
                String str2 = this.f34653z;
                boolean z13 = this.A;
                aggregatedAllAnalyticsLogger = publishAdvViewModel3.f34599e;
                postAdViewModel2 = publishAdvViewModel3.f34595a;
                UserEntity value = postAdViewModel2.a3().getValue();
                postAdViewModel3 = publishAdvViewModel3.f34595a;
                this.f34641a = publishAdvViewModel3;
                this.f34642b = createEditAdvActionType4;
                this.f34643c = str2;
                this.f34644d = n22;
                this.f34645e = value;
                this.f34646f = n22;
                this.f34647g = createEditAdvActionType4;
                this.f34648h = aggregatedAllAnalyticsLogger;
                this.f34649i = z13;
                this.f34650j = 1;
                x32 = postAdViewModel3.x3(this);
                if (x32 == f11) {
                    return f11;
                }
                listingDetailsEntity = n22;
                publishAdvViewModel = publishAdvViewModel3;
                createEditAdvActionType = createEditAdvActionType4;
                createEditAdvActionType2 = createEditAdvActionType;
                z11 = z13;
                listingDetailsEntity2 = listingDetailsEntity;
                aggregatedAllAnalyticsLogger2 = aggregatedAllAnalyticsLogger;
                str = str2;
                userEntity = value;
            }
            return wz.p.f75480a;
        }
        boolean booleanValue = ((Boolean) x32).booleanValue();
        this.f34641a = publishAdvViewModel;
        this.f34642b = createEditAdvActionType2;
        this.f34643c = listingDetailsEntity;
        this.f34644d = null;
        this.f34645e = null;
        this.f34646f = null;
        this.f34647g = null;
        this.f34648h = null;
        this.f34650j = 2;
        PublishAdvViewModel publishAdvViewModel4 = publishAdvViewModel;
        boolean z14 = z11;
        CreateEditAdvActionType createEditAdvActionType5 = createEditAdvActionType2;
        ListingDetailsEntity listingDetailsEntity4 = listingDetailsEntity;
        i11 = 1;
        if (AggregatedAllAnalyticsLoggerKt.M(aggregatedAllAnalyticsLogger2, createEditAdvActionType, listingDetailsEntity2, userEntity, booleanValue, str, null, null, null, z14, this, 224, null) == f11) {
            return f11;
        }
        createEditAdvActionType3 = createEditAdvActionType5;
        publishAdvViewModel2 = publishAdvViewModel4;
        listingDetailsEntity3 = listingDetailsEntity4;
        c cVar2 = new c(createEditAdvActionType3, AnalyticLoggerType.Firebase);
        i12 = a.f34654a[createEditAdvActionType3.ordinal()];
        if (i12 != i11) {
        }
        postAdViewModel4 = publishAdvViewModel2.f34595a;
        publishAdvViewModel2.c0(cVar2, postAdViewModel4.a3().getValue(), listingDetailsEntity3);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PublishAdvViewModel$logAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
