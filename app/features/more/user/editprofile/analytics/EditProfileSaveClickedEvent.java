package com.forsale.app.features.more.user.editprofile.analytics;

import com.forsale.app.analytics.base.AnalyticsParameters;
import ee.e;
import ee.f;
import g00.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import u9.b;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: EditProfileSaveClicked.kt */
/* loaded from: classes2.dex */
public final class EditProfileSaveClickedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final f f33121a;

    /* renamed from: b  reason: collision with root package name */
    private final b f33122b;

    public EditProfileSaveClickedEvent(f editProfileSavedClickedAnalyticsModel, b key) {
        o.i(editProfileSavedClickedAnalyticsModel, "editProfileSavedClickedAnalyticsModel");
        o.i(key, "key");
        this.f33121a = editProfileSavedClickedAnalyticsModel;
        this.f33122b = key;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.more.user.editprofile.analytics.EditProfileSaveClickedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                f fVar;
                f fVar2;
                f fVar3;
                f fVar4;
                o.i(invoke, "$this$invoke");
                fVar = EditProfileSaveClickedEvent.this.f33121a;
                String c11 = fVar.c();
                String str = "";
                if (c11 == null) {
                    c11 = "";
                }
                invoke.c("OldEmail", c11);
                fVar2 = EditProfileSaveClickedEvent.this.f33121a;
                String a11 = fVar2.a();
                if (a11 == null) {
                    a11 = "";
                }
                invoke.c("NewEmail", a11);
                fVar3 = EditProfileSaveClickedEvent.this.f33121a;
                String d11 = fVar3.d();
                if (d11 == null) {
                    d11 = "";
                }
                invoke.c("OldName", d11);
                fVar4 = EditProfileSaveClickedEvent.this.f33121a;
                String b11 = fVar4.b();
                if (b11 != null) {
                    str = b11;
                }
                invoke.c("NewName", str);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParameters analyticsParameters) {
                b(analyticsParameters);
                return p.f75480a;
            }
        });
    }

    @Override // u9.c
    public b getKey() {
        return this.f33122b;
    }

    public /* synthetic */ EditProfileSaveClickedEvent(f fVar, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i11 & 2) != 0 ? e.f54806a : bVar);
    }
}
