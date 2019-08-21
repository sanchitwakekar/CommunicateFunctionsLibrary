using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Communicate.Functions.Library.RNCommunicateFunctionsLibrary
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNCommunicateFunctionsLibraryModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNCommunicateFunctionsLibraryModule"/>.
        /// </summary>
        internal RNCommunicateFunctionsLibraryModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNCommunicateFunctionsLibrary";
            }
        }
    }
}
