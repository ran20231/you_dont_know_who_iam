package com.forsale.app.utils.analytics;

import com.forsale.app.utils.s;
import kotlin.jvm.internal.o;
/* compiled from: UserPropertiesLogger.kt */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final AmplitudeLogger f40072a;

    /* renamed from: b  reason: collision with root package name */
    private final LeanPlumLogger f40073b;

    /* renamed from: c  reason: collision with root package name */
    private final s f40074c;

    public m(AmplitudeLogger amplitudeLogger, LeanPlumLogger leanPlumLogger, s moEngageLogger) {
        o.i(amplitudeLogger, "amplitudeLogger");
        o.i(leanPlumLogger, "leanPlumLogger");
        o.i(moEngageLogger, "moEngageLogger");
        this.f40072a = amplitudeLogger;
        this.f40073b = leanPlumLogger;
        this.f40074c = moEngageLogger;
    }
}
